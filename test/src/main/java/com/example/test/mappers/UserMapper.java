package com.example.test.mappers;

import com.example.test.dto.UserRequest;
import com.example.test.dto.UserResponse;
import com.example.test.repositories.entities.User;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL, withIgnoreNullValue = true)
public interface UserMapper {
    UserResponse userToUserResponse(User user);
    User userRequestToUser(UserRequest userRequest);
}
