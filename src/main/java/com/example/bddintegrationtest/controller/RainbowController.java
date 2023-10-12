package com.example.bddintegrationtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RainbowController {
    @GetMapping("/rainbow/{color}")
    public Integer getRainbowColors( @PathVariable final String color ) {
        List<String> vibgyor = Arrays.asList("Violet", "Blue", "Indigo", "Green", "Yellow", "Orange", "Red");
        return vibgyor.indexOf(color)+1;
    }
}
