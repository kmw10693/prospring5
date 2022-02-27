package com.example.prospring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("gigi")
@Lazy
public class TrickyTarget {
    Foo fooOne;
    Foo fooTwo;
    Bar bar;

    public TrickyTarget() {
        System.out.println("TrickyTarget.TrickyTarget");
    }

    public TrickyTarget(Foo fooOne) {
        System.out.println("Target(Foo) 호출");
    }

    public TrickyTarget(Foo fooOne, Bar bar) {
        System.out.println("Target(Foo, Bar) 호출");
    }

    @Autowired
    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("TrickyTarget.setFooOne");
    }

    @Autowired
    public void setFooTwo(Foo foo) {
        this.fooTwo = foo;
        System.out.println("TrickyTarget.setFooTwo");
    }

    @Autowired
    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("TrickyTarget.setBar");
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-04.xml");
        ctx.refresh();

        TrickyTarget t = ctx.getBean(TrickyTarget.class);

        ctx.close();
    }

}
