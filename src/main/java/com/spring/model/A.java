package com.spring.model;

public class A {
    private static A instance;

    private A() {
        System.out.println("the default private constructor");
    }

//    public static void setInstance(A instance) {
//        A.instance = instance;
//    }

    public static synchronized A getInstance() {
        if (instance == null) {
            synchronized (A.class) {
                System.out.println("static ()");
                instance = new A();
            }
        }
        return instance;
    }
    public void disp(){
        System.out.println("comming to the disp()");
    }

    @Override
    public String toString() {
        return "A{}";
    }
}
