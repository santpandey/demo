package com.example.demo.controller;

import com.example.demo.listener.NumberGeneratorListener;
import com.example.demo.schedulers.NumberGenerator;
import com.example.demo.service.DataResponse;
import com.example.demo.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

    @Autowired
    private GeneratorService generatorService;



    @RequestMapping("/initialize")
    public ResponseResult initialize(){

        return new ResponseResult(200 , "Success");

    }

    @RequestMapping(value = "/getData" , method = RequestMethod.GET)
    public DataResponse getResult() {

        return generatorService.getData();
    }


}


