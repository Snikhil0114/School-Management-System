package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String qualification;
    @Embedded
    private Address address;
    @ManyToOne
    private Institution institution;

    @ManyToOne
    private Department department;
}
