package com.alertavecinal.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("neighbor")
public class NeighborController {

    @RequestMapping("/hi")
    public String index() {
        return "Greetings!";
    }





    
}
