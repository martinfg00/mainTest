package main_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main_project.application.User;
import main_project.application.UserRepository;

@Service
public class UserServices {

    @Autowired
    private UserRepository userReposiroty;

    public List<User> findByUsersByName(String name){
        return userReposiroty.findByName(name);
    }

    //public List<User> findUsersByAge(int age){
        //return userReposiroty.findByAgeGreaterThan(age);
    //}
    
    public User findUserByEmail(String email){
        return userReposiroty.findByEmail(email);
    }

    public List<User> searchUsersByNameKeyword(String keyword){
        return userReposiroty.findByNameContaining(keyword);
    }
}
