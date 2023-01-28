package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "All details about Employee")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private long userid;

    @Column(name="email")
    private String email;

    @Column(name="name")
    private String name;

    @Column(name = "isactive")
    private boolean isactive = true;
}
