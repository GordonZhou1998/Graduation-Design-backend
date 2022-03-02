package com.neusoft.zywlzl.controller;

import com.neusoft.zywlzl.model.Role;
import com.neusoft.zywlzl.model.User;
import com.neusoft.zywlzl.service.RoleService;
import com.neusoft.zywlzl.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LoginController {

    @PostMapping("/authenticate")
    public String authenticate() {
        return "success";
    }

    @PostMapping("/register")
    public int register(User user) {
        UserService userService = new UserService();
        return userService.insert(user);
    }
}