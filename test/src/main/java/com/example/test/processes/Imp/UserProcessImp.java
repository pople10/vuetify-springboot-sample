package com.example.test.processes.Imp;

import com.example.test.dto.UserRequest;
import com.example.test.dto.UserResponse;
import com.example.test.mappers.UserMapper;
import com.example.test.processes.UserProcess;
import com.example.test.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProcessImp implements UserProcess {
    private final UserService userService;

    private final UserMapper userMapper;

    @Override
    public UserResponse addUser(UserRequest userRequest) {
        return userMapper.userToUserResponse(userService.addUser(userMapper.userRequestToUser(userRequest)));
    }
}
