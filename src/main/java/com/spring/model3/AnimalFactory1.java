package com.spring.model3;

public class AnimalFactory1 {
    public Animal1 getAnimal1(){
        Tiger1 tiger=new Tiger1();
        tiger.disp();
        return tiger;
    }

    @Override
    public String toString() {
        return "AnimalFactory{}";
    }
}
