package me.claystation.testexample;

import org.springframework.stereotype.Component;

public class StaticClass {

    public static boolean thisMethodCallsGCP() {
        System.out.println("StaticClass method is called!");
        return true;
    }
}
