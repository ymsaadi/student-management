package com.ymsaadi.studentmanagement.controller;

import com.ymsaadi.studentmanagement.model.AuthenticationRequest;
import com.ymsaadi.studentmanagement.model.AuthenticationResponse;
import com.ymsaadi.studentmanagement.model.RegisterRequest;
import com.ymsaadi.studentmanagement.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
//@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

//    @PostMapping("/register")
//    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest registerRequest) {
//        return ResponseEntity.ok(authenticationService.register(registerRequest));
//    }

    @MutationMapping
    public AuthenticationResponse register(@Argument RegisterRequest registerRequest) {
        return authenticationService.register(registerRequest);
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest authenticationRequest) {
        return ResponseEntity.ok(authenticationService.authenticate(authenticationRequest));
    }
}