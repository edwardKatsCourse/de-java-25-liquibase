package com.example.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "lease_car")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LeaseCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
