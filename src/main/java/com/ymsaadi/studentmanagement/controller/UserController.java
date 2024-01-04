package com.ymsaadi.studentmanagement.controller;

import com.ymsaadi.studentmanagement.model.User;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @QueryMapping
    public User userById(@Argument Integer id) {
        return new User(1, "general", "kenobi", "g.kenobi@starwars.com", "1234567");
    }
}
