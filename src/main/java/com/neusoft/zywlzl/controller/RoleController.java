package com.neusoft.zywlzl.controller;

import com.neusoft.zywlzl.model.Role;
import com.neusoft.zywlzl.service.RoleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @PostMapping("/allroles")
    public List<Role> getAllRoleList() {
        RoleService roleService = new RoleService();
        return roleService.selectAll();
    }
}
