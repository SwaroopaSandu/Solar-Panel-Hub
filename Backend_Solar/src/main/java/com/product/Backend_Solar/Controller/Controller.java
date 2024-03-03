package com.product.Backend_Solar.Controller;


import com.product.Backend_Solar.Entity.Users;
import com.product.Backend_Solar.Repository.UsersRepo;
import com.product.Backend_Solar.Service.UserService;
import com.product.Backend_Solar.ServiceImplementation.UserServiceImplementation;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/solar")
public class Controller {


    @Autowired
    private UserService userService;

    @Autowired
    private UserServiceImplementation userServiceImplementation;
    @Autowired
    private UsersRepo repo;



    @PostConstruct
    public void initRoleAndUser() {
        userServiceImplementation.initRolesAndUser();
    }

    @PostMapping(path = "/register")
    public ResponseEntity<Users> create_User(@RequestBody Users users)
    {
        return new ResponseEntity<> (userService.create_User(users), HttpStatus.CREATED);
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> userLogin(@RequestBody Users user)
    {
        System.out.println(user);
       Users usersDTO = repo.findByEmail(user.getEmail());
       if(usersDTO.getPassword().equals(user.getPassword()))
           return ResponseEntity.ok(usersDTO);
       return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }


    @GetMapping({"/forAdmin"})
    @PreAuthorize("hasRole('Admin')")
    public String forAdmin(){
        return "This URL is only accessible to the admin";
    }

    @GetMapping({"/forUser"})
    @PreAuthorize("hasRole('User')")
    public String forUser(){
        return "This URL is only accessible to the user";
    }



}


