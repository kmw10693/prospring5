package com.example.prospring5;

public class ContextalizedDependencyLookup {

    private Dependency dependency;

    public void performLookup(Container container) {
        this.dependency = (Dependency) container.getDependency("myDependency");
    }
}
