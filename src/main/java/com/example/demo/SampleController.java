package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String hello(@RequestParam("id") Person person){

        return "hello " + person.getName();

    }

    @GetMapping("message")
    @ResponseBody
    public String message(@RequestBody String body){
        return body;

    }

}
