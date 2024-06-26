package com.test.errormanagement.controller;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.errormanagement.core.bean.UserBean;
import com.test.errormanagement.core.mapper.UserMapper;
import com.test.errormanagement.service.UserService;

import lombok.AllArgsConstructor;

import com.test.errormanagement.constant.UrlConstant;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstant.USER_URL)
public class UserController {
    @Autowired
    private UserService userService;
    private UserMapper userMapper;

    @GetMapping
    public ResponseEntity<UserBean> getUser(@RequestBody String username) {
        return ResponseEntity.ok(userMapper.toBean(userService.get(username)));
    }
}
