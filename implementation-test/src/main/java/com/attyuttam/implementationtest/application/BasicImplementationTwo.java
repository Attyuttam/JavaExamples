package com.attyuttam.implementationtest.application;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("basicImplementationTwo")
public class BasicImplementationTwo implements BasicInterface{

    @Override
    public String display() {
        return "Present in BasicImplementationTwo";
    }
}
