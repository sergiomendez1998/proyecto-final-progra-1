package com.mycompany.emsa.project.controller.service.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.ConstructorParameters;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class User {
    private int idUser;
    private String name;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String email;
    private String password;
    private String role;
    private Boolean status;
    private Date createdAt;

    public User(String name, String lastName, String phoneNumber, String address, String email, String password, String role, Boolean status) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
    }
}
