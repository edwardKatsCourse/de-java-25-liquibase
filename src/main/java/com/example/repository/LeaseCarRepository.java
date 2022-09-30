package com.example.repository;

import com.example.entity.LeaseCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseCarRepository extends JpaRepository<LeaseCar, Long> {
}
