package me.claystation.testexample;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DevComponent {

    public DevComponent() {
        System.out.println("Real component used in prod");
    }
}
