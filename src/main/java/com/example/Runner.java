package com.example;

import com.example.entity.Company;
import com.example.entity.Employee;
import com.example.entity.LeaseCar;
import com.example.repository.CompanyRepository;
import com.example.repository.EmployeeRepository;
import com.example.repository.LeaseCarRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
@AllArgsConstructor
public class Runner implements CommandLineRunner {

    private final LeaseCarRepository leaseCarRepository;
    private final EmployeeRepository employeeRepository;
    private final CompanyRepository companyRepository;

    @Override
    public void run(String... args) throws Exception {

        var c1 = Company.builder()
                .companyName("abc")
                .build();

        companyRepository.save(
                c1
        );



        Employee employee = Employee.builder()
                .company(c1)
                .fullName("Peter  Stone")
                .build();

        employeeRepository.save(employee);

        LeaseCar leaseCar = LeaseCar.builder()
                .employee(employee)
                .build();

        leaseCarRepository.save(leaseCar);
    }
}
