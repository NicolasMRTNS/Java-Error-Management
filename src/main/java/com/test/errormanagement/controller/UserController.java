package com.test.errormanagement.controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.errormanagement.core.entity.User;
import com.test.errormanagement.service.UserService;
import com.test.errormanagement.constant.UrlConstant;

@RestController(UrlConstant.USER_URL)
public class UserController {
    @Lazy
    private UserService userService;

    @GetMapping
    public ResponseEntity<User> getUser(@RequestBody String username) {
        return ResponseEntity.ok(userService.get(username));
    }
}
