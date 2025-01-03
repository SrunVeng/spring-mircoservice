package com.example.employee_service.infrastructure.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="departments")
@ToString
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;


    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // free writing when set
    @Column(nullable = false)
    private String jobTitle;

    // make enum ( Chief, Head, Senior Manager, Manager, Senior Associate, Associate, Junior Associate,Apprentice)
    @Column(nullable = false)
    private String jobGrade;




}
