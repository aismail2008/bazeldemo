package com.company.helloworld;

import com.company.greeter.Greeter;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        System.out.println(g.greet());
    }
}
