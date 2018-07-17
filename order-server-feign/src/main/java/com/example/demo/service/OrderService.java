package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("service-member")
public interface OrderService {

    @RequestMapping("getInfo")
    public List<String> getList();

}