package com.attyuttam.implementationtest.application;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;


@Component
@AllArgsConstructor
@Qualifier("basicImplementationOne")
public class BasicImplementationOne implements BasicInterface{

    public final BasicInterface basicImplementationTwo;
    @Override
    public String display() {
        return "Present in BasicImplementationOne"+basicImplementationTwo.display();
    }
    
}
