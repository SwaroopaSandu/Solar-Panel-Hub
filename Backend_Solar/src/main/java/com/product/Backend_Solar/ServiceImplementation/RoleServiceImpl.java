package com.product.Backend_Solar.ServiceImplementation;

import com.product.Backend_Solar.Entity.Role;
import com.product.Backend_Solar.Repository.RoleRepo;
import com.product.Backend_Solar.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImpl implements RoleService {


    @Autowired
    private RoleRepo roleRepo;

    public Role createNewRole(Role role) {
        return roleRepo.save(role);
    }


}
