package com.product.Backend_Solar.Entity;
import javax.persistence.*;
import javax.persistence.FetchType;
import java.util.Set;


@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;

    @Column(name="email")
    private String email;


    @Column(name = "username")
    private String username;


    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private Set<Role> role;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }

    public Users() {
    }


}



