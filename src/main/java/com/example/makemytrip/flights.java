package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flights {
    @GetMapping("/flights")
    public String getData() {return "20% DISCOUNT ON FLIGHTS BOOKING FROM AIR INDIA";}

}

