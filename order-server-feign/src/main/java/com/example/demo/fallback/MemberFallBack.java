package com.example.demo.fallback;

import com.example.demo.service.OrderService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemberFallBack implements OrderService {
    @Override
    public List<String> getList() {
        //服务降级处理
        List<String> list = new ArrayList<String>();
        list.add( "服务发生异常..." );
        return list;
    }
}
