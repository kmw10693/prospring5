package com.example.prospring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Service;

@Service("constructorConfusion")
public class ConstructorConfusion {

    private String someValue;


    public ConstructorConfusion(String someValue) {
        System.out.println("ConstructorConfusion.ConstructorConfusion");
        this.someValue = someValue;
    }

    @Autowired
    public ConstructorConfusion(@Value("90") int someValue) {
        System.out.println("ConstructorConfusion.ConstructorConfusion");
        this.someValue = "숫자 값: " + Integer.toString(someValue);
    }

    public static void main(String[] args) {
        GenericApplicationContext ctx = new GenericApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();

        ConstructorConfusion cc = (ConstructorConfusion)
                ctx.getBean("constructorConfusion");
        System.out.println(cc);
        ctx.close();
    }

}
