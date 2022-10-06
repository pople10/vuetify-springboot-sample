package com.example.test.repositories.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String firstname;

    private String lastname;

    private String email;

    private String phone;

    @Id
    @GeneratedValue
    private Long id;
}
