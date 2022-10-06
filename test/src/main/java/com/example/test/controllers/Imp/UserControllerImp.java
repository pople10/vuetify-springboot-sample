package com.example.test.controllers.Imp;

import com.example.test.controllers.UserController;
import com.example.test.dto.UserRequest;
import com.example.test.dto.UserResponse;
import com.example.test.processes.UserProcess;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name="USER")
public class UserControllerImp implements UserController {
    @Autowired
    private UserProcess userProcess;

    @Override
    public ResponseEntity<UserResponse> createUser(UserRequest userRequest) {
        return ResponseEntity.status(201).body(userProcess.addUser(userRequest));
    }
}
