package com.example.demo.service;

import com.example.demo.listener.NumberGeneratorListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GeneratorService {

    Logger logger = LoggerFactory.getLogger(GeneratorService.class);

    @Autowired
    private NumberGeneratorListener numberGeneratorListener;

    public DataResponse getData(){
        List<Integer> list = numberGeneratorListener.getAllList();
        /*
            300 numbers are emitted per minute
         */

        DataResponse dataResponse = new DataResponse();
        int size = list.size();

        if(size < 1500){
            dataResponse.setFiveMinute(list);
        }else {
            int pivot = size - 1500;

            dataResponse.setFiveMinute(
                    list.stream().skip(pivot).limit(1500).collect(Collectors.toList())
            );
        }

        if(size < 3000){
            dataResponse.setTenMinute(list);
        }else{
            int pivot = size - 3000;
            dataResponse.setTenMinute(
                    list.stream().skip(pivot).limit(3000).collect(Collectors.toList())
            );
        }

        if(size < 9000){
            dataResponse.setThirtyMinute(list);
        }else {
            int pivot = size - 9000;
            dataResponse.setThirtyMinute(
                    list.stream().skip(pivot).limit(9000).collect(Collectors.toList())
            );
        }

        dataResponse.setAllList(list);
        return dataResponse;
    }
}
