package com.example.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class ControllerEmp {
    List<Employee> list = new ArrayList<>();

    @PostMapping("/insertdata")
    public response empAdd(@RequestBody Employee emp){
        if(list.add(emp)){
            return new response(150,"Success in Insert",emp);
        }
        return new response(404,"Failed to Insert",null);
    }

    @GetMapping("/getall")
    public response getAll(){
        if(list.size() > 0){
            return new response(150,"Success in Fetch",list);
        }
        return new response(404,"Failed to Fetch",null);
    }

    @GetMapping("/getid/{ids}")
    public response getId(@PathVariable int ids){
        return new response(150, "Selected", null);
    }
}
