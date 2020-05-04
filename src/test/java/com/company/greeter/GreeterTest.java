package com.company.greeter;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreeterTest {

    @Test
    public void test(){
        assertNotNull(new Greeter().greet());
    }
}