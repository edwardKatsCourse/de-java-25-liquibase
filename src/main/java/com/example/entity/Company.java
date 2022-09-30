package com.example.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "company")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // nullable=false
    // unique=true
    @Column(name = "company_name")
    private String companyName;
}
