package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meow")
public class springmr {
    
    @GetMapping("/munipmr")
    public String munipmr(){
        return "Hello....! Welcome Muni Raghava";
    }

    @GetMapping("/home")
    public String home(){
        return "This is my first SpringBoot Code";
    }

    @GetMapping("/hellomr")
    public String hello(){
        return "String Value for hellomr";
    }

    @GetMapping("/pmr")
    public String rpmr(){
        return "Name : MUNI RAGHAVA PALLAMALA";
    }

    @PostMapping("/data")
    public String data(@RequestBody addModel model){
        return (model.getA() + model.getB());
    }

    @PostMapping("/add/{a}/{b}")
    public String add(@PathVariable String a,@PathVariable int b){
        return (a + b);
    }

    @GetMapping("/add2/{a}/{b}")
    public String add2(@PathVariable String a,@PathVariable int b){
        return (a + b);
    }

}
