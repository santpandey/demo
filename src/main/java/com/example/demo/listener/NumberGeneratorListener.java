package com.example.demo.listener;

import com.example.demo.schedulers.Generator;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NumberGeneratorListener implements ApplicationListener<Generator> {

    List<Integer> allList;

    NumberGeneratorListener(List<Integer> allList){
        this.allList = allList;
    }

    @Override
    public void onApplicationEvent(Generator generator) {
        int number = generator.getNumber();
        allList.add(number);
    }

    public List<Integer> getAllList() {
        return allList;
    }
}
