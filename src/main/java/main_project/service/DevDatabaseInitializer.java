package main_project.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDatabaseInitializer implements CommandLineRunner {

    @Override
    public void run(String... args){
        System.out.println("Dev database initializer running");
    }

}
