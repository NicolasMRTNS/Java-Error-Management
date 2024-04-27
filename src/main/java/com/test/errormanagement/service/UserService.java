package com.test.errormanagement.service;

import com.test.errormanagement.core.entity.User;
import com.test.errormanagement.exception.notfound.UserNotFoundException;
import com.test.errormanagement.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User get(String username) {
        final Optional<User> user = userRepository.findByUsername(username);
        if (user.isEmpty()) {
            throw new UserNotFoundException(username);
        }
        return user.get();
    }
}
