package com.example.test.services;

import com.example.test.repositories.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User updateUser(User user);
    void removeUser(Long id);
    User findUserById(Long id);
    List<User> findAllUsers();
    Page<User> findAllUsersPageable(Pageable pageable);
}
