package main_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.stereotype.Component;

@Component
public class ProfileChecker {

    @Autowired
    private Environment env;

    public void checkProfile() {
        if (env.acceptsProfiles(Profiles.of("dev"))) {
            System.out.println("Checked");
        }
    }

}
