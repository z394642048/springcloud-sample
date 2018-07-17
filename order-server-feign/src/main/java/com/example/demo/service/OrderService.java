package com.example.demo.service;

import com.example.demo.fallback.MemberFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "service-member",fallback = MemberFallBack.class)
public interface OrderService {

    @RequestMapping("getInfo")
    public List<String> getList();

}
