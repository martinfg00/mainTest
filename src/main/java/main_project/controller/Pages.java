package main_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Pages {

    public class AdminController{
        @GetMapping("/admin/dashboard")
        public String adminDashboard(){
            return "admin/dashboard";
            }
    }

    public class UserController{
        @GetMapping("/user/profile")
        public String userProfile(){
            return "user-profile";
        }
    }

}
