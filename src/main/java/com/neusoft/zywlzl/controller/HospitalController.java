package com.neusoft.zywlzl.controller;

import com.neusoft.zywlzl.model.Hospital;
import com.neusoft.zywlzl.model.User;
import com.neusoft.zywlzl.service.HospitalService;
import com.neusoft.zywlzl.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HospitalController {

    @PostMapping("/hospital/searchall")
    public List<Hospital> searchAll() {
        HospitalService hospitalService = new HospitalService();
        return hospitalService.selectAll();
    }

    @PostMapping("/register")
    public int register(User user) {
        UserService userService = new UserService();
        return userService.insert(user);
    }

}
