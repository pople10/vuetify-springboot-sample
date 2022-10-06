package com.example.test.services.Imp;

import com.example.test.repositories.UserRepository;
import com.example.test.repositories.entities.User;
import com.example.test.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void removeUser(Long id) {
        userRepository.delete(findUserById(id));
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Page<User> findAllUsersPageable(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
