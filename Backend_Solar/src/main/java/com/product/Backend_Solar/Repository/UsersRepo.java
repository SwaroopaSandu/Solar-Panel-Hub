package com.product.Backend_Solar.Repository;

import com.product.Backend_Solar.Entity.Users;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends CrudRepository<Users, Long> {

    Users findByEmail(String email);

}
