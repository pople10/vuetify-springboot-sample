package com.example.test.processes;

import com.example.test.dto.UserRequest;
import com.example.test.dto.UserResponse;

public interface UserProcess {
    UserResponse addUser(UserRequest userRequest);
}
