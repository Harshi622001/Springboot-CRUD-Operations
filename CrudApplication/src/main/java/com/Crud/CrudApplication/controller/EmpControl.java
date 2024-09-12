package com.Crud.CrudApplication.controller;

import com.Crud.CrudApplication.Entity.Employee;
import com.Crud.CrudApplication.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/emp")
public class EmpControl {
    @Autowired
    private EmpService empService;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee e) {
        return empService.save(e);
    }

    @GetMapping("/find-by-id/{id}")
    Employee getMethod(@PathVariable("id") Integer id) {
        return empService.getMethod(id);
    }

    @GetMapping("/findAll")
    List<Employee> findAll() {
        return empService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    String delete(@PathVariable("id") Integer id) {
        empService.delete(id);
        return "Employee details is deleted successfully";
    }

    @PutMapping("/update/{id}")
    public Employee update(@PathVariable("id") Integer id, @RequestBody Employee updatedEmployee) {
        return empService.update(id, updatedEmployee);
    }


}
