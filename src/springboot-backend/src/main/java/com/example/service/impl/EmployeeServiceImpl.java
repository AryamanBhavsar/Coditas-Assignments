package com.example.service.impl;

import com.example.exception.ResourceNotFoundExcception;
import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
//        if(employee.isPresent()){
//            return employee.get();
//        }else {
//            throw new ResourceNotFoundExcception("Employee","Id",id);
//        }

        return employeeRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundExcception("Employee","Id",id));

    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee existingemployee = employeeRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundExcception("Employee","id",id)
        );

        existingemployee.setFirstName(employee.getFirstName());
        existingemployee.setLastName(employee.getLastName());
        existingemployee.setEmail(employee.getEmail());

        employeeRepository.save(existingemployee);

        return existingemployee;
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundExcception("Employee","id",id)
        );

        employeeRepository.deleteById(id);
    }
}
