package com.caihao.consumeruser.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author CaiHao
 * @create 2019-09-08 22:44:47
 */

@RestController
public class UserController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyticket(String name){
        String st = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);

        return name+"购买了："+st;
    }

}
