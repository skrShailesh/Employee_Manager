package com.shailesh.EmpManager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // @RequestMapping("m")// the URL is mapped using this . eg:- http://localhost:8080/m    (m: is the end point)
   

     //List<Employee> employees=new ArrayList<>();
    Service service= new ServiceImpl() ;

    // @Autowired
    //  Service service;

    @GetMapping("employees")
    public List<Employee> getAllEmployee(){
        return  service.readEmployees();
    }
    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee){
        // employees.add(employee);
        return service.createEmployee(employee);
        
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if (service.deleteEmployee(id)) 
            return "Deleted Sucessfully";
            return "Not Found";
        
    }
}
