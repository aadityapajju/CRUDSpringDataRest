package com.example.CRUDDemo.DAO;

import com.example.CRUDDemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "members")//can use this annotation ot change endpoit from employees to members
public interface EmployeeRepsitory extends JpaRepository<Employee, Integer> { //<enity, primary key>

}
