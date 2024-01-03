package com.ymsaadi.studentmanagement.controller;

import com.ymsaadi.studentmanagement.model.AuthenticationRequest;
import com.ymsaadi.studentmanagement.model.AuthenticationResponse;
import com.ymsaadi.studentmanagement.model.RegisterRequest;
import com.ymsaadi.studentmanagement.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @MutationMapping
    public AuthenticationResponse register(@Argument RegisterRequest registerRequest) {
        return authenticationService.register(registerRequest);
    }
    @MutationMapping
    public AuthenticationResponse authenticate(@Argument AuthenticationRequest authenticationRequest) {
        return authenticationService.authenticate(authenticationRequest);
    }
}