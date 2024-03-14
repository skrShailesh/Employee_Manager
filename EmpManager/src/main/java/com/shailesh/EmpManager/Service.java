package com.shailesh.EmpManager;

import java.util.List;

public interface Service { 
    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id); 
}
