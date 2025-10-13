package com.telusko.myApp;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Compiling with 404 bugs");

    }
}
