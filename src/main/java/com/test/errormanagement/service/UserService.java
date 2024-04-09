package com.test.errormanagement.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.errormanagement.core.entity.User;
import com.test.errormanagement.exception.notfound.UserNotFoundException;
import com.test.errormanagement.persistence.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    public User get(String username) {
        final Optional<User> user = userRepository.findByUsername(username);
        if (user.isEmpty()) {
            throw new UserNotFoundException(username);
        }
        return user.get();
    }
}
