package com.Crud.CrudApplication.service;

import com.Crud.CrudApplication.Entity.Employee;

import java.util.List;

public interface EmpService {
    Employee save(Employee e);

    Employee getMethod(Integer id);

    List<Employee> findAll();

    Employee delete(Integer id);

    Employee update(Integer id, Employee updatedEmployee);
}
