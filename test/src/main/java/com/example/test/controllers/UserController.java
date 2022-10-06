package com.example.test.controllers;

import com.example.test.dto.UserRequest;
import com.example.test.dto.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Validated
@RequestMapping("api/user")
public interface UserController {
    @PostMapping(path = "add")
    ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest);
}
