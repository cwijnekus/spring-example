package me.claystation.testexample;

import org.springframework.stereotype.Component;

@Component
public class AComponentClass implements AComponentInterface {

    public boolean thisMethodCallsGCP() {
        System.out.println("AComponentClass method is called!");
        return true;
    }
}
