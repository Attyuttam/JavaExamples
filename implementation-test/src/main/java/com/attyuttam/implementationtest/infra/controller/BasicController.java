package com.attyuttam.implementationtest.infra.controller;

import com.attyuttam.implementationtest.application.BasicInterface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BasicController {
    
    public final BasicInterface basicImplementationOne;
    public final BasicInterface basicImplementationTwo;

    @GetMapping("/api/basic/one")
    public String basicControllerOne(){
        return basicImplementationOne.display();
    }
    
    @GetMapping("/api/basic/two")
    public String basicControllerTwo(){
        return basicImplementationTwo.display();
    }
}
