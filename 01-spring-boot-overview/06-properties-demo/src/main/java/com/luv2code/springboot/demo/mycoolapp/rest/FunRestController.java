package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Team name is " + teamName + " and Coach name is " + coachName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World" ;
    }

    @GetMapping("/workout")
    public String dailyWorkout(){
        return "do some exercises";
    }

    @GetMapping("/fortune")
    public String fortune(){
        return "you are very lucky";
    }


}