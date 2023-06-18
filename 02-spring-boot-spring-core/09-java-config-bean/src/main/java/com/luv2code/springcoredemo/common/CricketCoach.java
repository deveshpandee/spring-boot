package com.luv2code.springcoredemo.common;

 import jakarta.annotation.PostConstruct;
 import jakarta.annotation.PreDestroy;
 import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName() );
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practice fast bowling for 20 minutes";
    }
}
