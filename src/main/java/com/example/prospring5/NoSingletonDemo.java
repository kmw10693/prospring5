package com.example.prospring5;

import org.springframework.context.support.GenericXmlApplicationContext;

public class NoSingletonDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();

        Singer singer1 = ctx.getBean("nonSingleton", Singer.class);
        Singer singer2 = ctx.getBean("nonSingleton", Singer.class);

        System.out.println((singer1 == singer2));
        System.out.println(singer1.equals(singer2));
    }
}
