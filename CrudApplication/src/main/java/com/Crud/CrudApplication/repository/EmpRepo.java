package com.Crud.CrudApplication.repository;

import com.Crud.CrudApplication.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
