package me.claystation.testexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.lang.String.valueOf;

@Component
public class StaticController {

    @Autowired
    public StaticController() {
        final boolean b = StaticClass.thisMethodCallsGCP();
        System.out.println("Boolean is: " + valueOf(b));
    }
}
