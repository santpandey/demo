package com.example.demo.schedulers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGenerator {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;


    @Scheduled(fixedDelay = 1000)
    public void generate() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Integer in = random.nextInt();
            Generator generator = new Generator(this, in);
            applicationEventPublisher.publishEvent(generator);
        }

    }
}
