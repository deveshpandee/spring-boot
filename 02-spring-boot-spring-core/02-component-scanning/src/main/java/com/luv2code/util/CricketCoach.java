package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "practice fast bowling for 20 minutes";
    }
}
