package com.example.bddintegrationtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class VersionController {
    @GetMapping("/version")
    public String getVersion() {
        return "1.0";
    }
}
