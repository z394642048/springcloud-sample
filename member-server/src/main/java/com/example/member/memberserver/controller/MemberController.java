package com.example.member.memberserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("member")
public class MemberController {

    @RequestMapping("getInfo")
    public List<String> getInfo(){
        List<String> list = new ArrayList<>();
        list.add( "333333333" );
        list.add( "dfgdfgdfg" );
        return list;
    }

}
