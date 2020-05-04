package com.company.greeter;

import com.company.greeter.names.Names;

public class Greeter {
    public String greet(){
        return "Hello from Greeter" + Names.name();
    }
}
