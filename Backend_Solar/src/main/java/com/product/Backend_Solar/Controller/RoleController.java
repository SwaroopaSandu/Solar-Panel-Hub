package com.product.Backend_Solar.Controller;

import com.product.Backend_Solar.Entity.Role;
import com.product.Backend_Solar.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin
@RequestMapping("/api/solar")
public class RoleController {


    @Autowired
    private RoleService roleService;

    @PostMapping("/createNewRole")
    public Role createNewRole(@RequestBody Role role) {
        return roleService.createNewRole(role);
    }

}
