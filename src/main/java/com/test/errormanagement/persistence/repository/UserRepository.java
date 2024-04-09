package com.test.errormanagement.persistence.repository;

import java.util.Optional;

import com.test.errormanagement.core.entity.User;

public interface UserRepository {
    Optional<User> findByUsername(String username);
}
