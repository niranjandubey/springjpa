package com.niranjan.springjpa.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${application.version:1.0}")
    public String applicationVersion;

    @GetMapping(value = "/")
    public ResponseEntity getHomePage(){
        return new ResponseEntity(applicationVersion,HttpStatus.OK);
    }

    @PostMapping(value = "/")
    public ResponseEntity postHomePage(){
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }


}
