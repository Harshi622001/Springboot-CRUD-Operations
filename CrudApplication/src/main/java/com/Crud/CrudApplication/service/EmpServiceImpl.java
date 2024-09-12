package com.Crud.CrudApplication.service;

import com.Crud.CrudApplication.Entity.Employee;
import com.Crud.CrudApplication.repository.EmpRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpRepo empRepo;

    @Override
    public Employee save(Employee e) {
        Employee s = empRepo.save(e);
        return s;
    }

    @Override
    public Employee getMethod(Integer id) {
        Optional<Employee> e = empRepo.findById(id);
        if (e.isPresent()) {
            return e.get();
        }
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return empRepo.findAll();
    }

    @Override
    public Employee delete(Integer id) {
        Optional<Employee> emp = empRepo.findById(id);
        if (emp.isPresent()) {
            Employee e = emp.get();
            empRepo.delete(e);
        }
        return null;
    }


    @Override
    public Employee update(Integer id, Employee updatedEmployee) {
        Optional<Employee> employeeOptional = empRepo.findById(id);
        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            employee.setName(updatedEmployee.getName());
            employee.setSalary(updatedEmployee.getSalary());
            return empRepo.save(employee);
        } else {
            throw new RuntimeException("Employee not found with id: " + id);
        }
    }

}






