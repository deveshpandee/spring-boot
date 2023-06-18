package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


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