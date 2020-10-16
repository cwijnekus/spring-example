package me.claystation.testexample;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class DevComponentStub {

    public DevComponentStub() {
        System.out.println("Test stub component used in tests");
    }
}
