package com.example.prospring5;

import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider {

    public String getMessage(){
        return "hello world";
    }
}
