package com.example.prospring5;

public class BookwormOracle implements Oracle{

    private Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;

    }

    @Override
    public String defineMeaningOfLife() {
        return "아무거나";
    }
}
