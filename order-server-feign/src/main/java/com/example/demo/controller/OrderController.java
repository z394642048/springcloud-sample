package com.example.demo.controller;

import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("getList")
    public List getList() {
        System.out.println("测试熔断");
        return orderService.getList();
    }


    @RequestMapping("/getOrderInfo")
    public String getOrderInfo(){
        return "测试降级";
    }

}
