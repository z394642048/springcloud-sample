package com.example.member.memberserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {

    static int i;

    @RequestMapping( "getInfo" )
    public List<String> getInfo() {
        List<String> list = new ArrayList<>();
        list.add( "333333333" );
        list.add( "dfgdfgdfg" );
        i++;
        list.add( "i的值为" + i );
        return list;
    }

}
