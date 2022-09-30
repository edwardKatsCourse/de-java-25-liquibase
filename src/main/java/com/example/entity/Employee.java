package com.example.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fullname")
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;


}
