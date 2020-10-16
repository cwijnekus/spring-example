package me.claystation.testexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.lang.String.valueOf;

@Component
public class AController {

    private final AComponentInterface aComponent;

    @Autowired
    public AController(final AComponentClass aComponent) {
        this.aComponent = aComponent;

        final boolean b = aComponent.thisMethodCallsGCP();
        System.out.println("Boolean is: " + valueOf(b));
    }
}
