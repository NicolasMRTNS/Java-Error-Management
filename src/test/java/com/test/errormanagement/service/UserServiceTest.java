package com.test.errormanagement.service;

import com.test.errormanagement.core.entity.User;
import com.test.errormanagement.persistence.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {
    final String USER_ID = "Test Username";
    User user = new User();

    @Autowired
    private UserService userService;
    @MockBean
    private UserRepository userRepository;

    @BeforeEach
    void setup() {
        user.setId(123);
        user.setUsername(USER_ID);
    }

    @Test
    void getUserSuccessTest() {
        when(userRepository.findByUsername(USER_ID)).thenReturn(Optional.ofNullable(user));
        User userReturned = userService.get(USER_ID);
        Assertions.assertEquals(userReturned.getId(), user.getId());
        Assertions.assertEquals(userReturned.getUsername(), USER_ID);
    }
}
