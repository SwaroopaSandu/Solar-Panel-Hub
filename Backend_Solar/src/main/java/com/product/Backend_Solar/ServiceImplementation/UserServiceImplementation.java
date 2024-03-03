package com.product.Backend_Solar.ServiceImplementation;

import com.product.Backend_Solar.Entity.Role;
import com.product.Backend_Solar.Entity.Users;
import com.product.Backend_Solar.Repository.RoleRepo;
import com.product.Backend_Solar.Repository.UsersRepo;
import com.product.Backend_Solar.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private RoleRepo roleRepo;


    @Autowired
    private PasswordEncoder passwordEncoder;


    public Users create_User(Users usersDTO) {

//        Users user = userDtoToEntity(usersDTO);
//        Users savedUser = usersRepo.save(user);
//        return entityToUserDto(savedUser);

        Role role = roleRepo.findById("User").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        usersDTO.setRole(userRoles);
        usersDTO.setPassword(getEncodedPassword(usersDTO.getPassword()));

        return usersRepo.save(usersDTO);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }




















    public void initRolesAndUser(){

        Role customerRole = new Role();
        customerRole.setRoleName("0");
        customerRole.setRoleDescription("Customer");
        roleRepo.save(customerRole);

        Role managerRole = new Role();
        managerRole.setRoleName("1");
        managerRole.setRoleDescription("Manager");
        roleRepo.save(managerRole);


        Role crewRole = new Role();
        crewRole.setRoleName("2");
        crewRole.setRoleDescription("Crew");
        roleRepo.save(crewRole);



        Users manager = new Users();
        manager.setEmail("manager1@solar.in");
        manager.setUsername("admin1");
        manager.setPassword("admin1234");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(managerRole);
        usersRepo.save(manager);

        Users crew = new Users();
        crew.setEmail("crew@solar.in");
        crew.setUsername("crew");
        crew.setPassword("crew123");
        Set<Role> crewRoles = new HashSet<>();
        crewRoles.add(crewRole);
        usersRepo.save(crew);

        Users customer = new Users();
        customer.setEmail("swaroopa@gmail.com");
        customer.setUsername("Swaroopa");
        customer.setPassword("user12345");
        Set<Role> customerRoles = new HashSet<>();
        customerRoles.add(customerRole);
        usersRepo.save(customer);


    }











//    private Users userDtoToEntity(UsersDTO usersDTO){
//        Users usersData = new Users();
//        usersData.setEmail(usersDTO.getEmail());
//        usersData.setUsername(usersDTO.getUsername());
//        usersData.setPassword(usersDTO.getPassword());
//        usersData.setRole(usersDTO.getRole());
//        return usersData;
//    }
//
//    private UsersDTO entityToUserDto(Users savedUser){
//        UsersDTO usersDTO = new UsersDTO();
//        usersDTO.setId(savedUser.getId());
//        usersDTO.setEmail(savedUser.getEmail());
//        usersDTO.setPassword(savedUser.getPassword());
//        usersDTO.setUsername(savedUser.getUsername());
//        usersDTO.setRole(savedUser.getRole());
//        return usersDTO;
//    }















}
