package com.shailesh.EmpManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("m")// the URL is mapped using this . eg:- http://localhost:8080/m    (m: is the end point)
    public static String myMethod(){
        return "<h1> START </h1>";
    }
    
    @GetMapping("process-form")
    public static String getDeta(@RequestParam int num1,@RequestParam int num2){
        int res=num1+num2;
        //return String.valueOf(res);
        // OR 
        return "Result: "+res;
    }
}
