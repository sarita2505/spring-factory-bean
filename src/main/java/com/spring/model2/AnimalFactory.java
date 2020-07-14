package com.spring.model2;

public class AnimalFactory {
    public static Animal getAnimal(){
        Tiger tiger=new Tiger();
        tiger.disp();
        return tiger;
    }

    @Override
    public String toString() {
        return "AnimalFactory{}";
    }
}
