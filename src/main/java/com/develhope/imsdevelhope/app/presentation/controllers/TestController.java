package com.develhope.imsdevelhope.app.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * a test controller.
 * @author kamar baraka.*/

@RestController
@RequestMapping(value = {"/app"})
public class TestController {

    @GetMapping(value = {"/greeting"})
    public String greeting(@RequestParam("name") String name){

        return "hello "+ name;
    }
}
