package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class controller{

    @PostMapping("/test/zk")
    //public void zavav1(){
    public String zk1_1(@RequestBody String body) {

        //System.out.println("Ответ");

        return body + " Привет!";

        //return body;
    }
    @GetMapping("/test/zk")
    public String zk1_2() {
        return "Привет! Это заглушка";
    }
}
