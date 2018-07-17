package com.example.member.memberserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {

    static int i;
    @Value( "${server.port}" )
    String port;

    @RequestMapping( "getInfo" )
    public List<String> getInfo() {
        try {

            Thread.sleep( 500 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> list = new ArrayList<>();
        list.add( "333333333" );
        list.add( "dfgdfgdfg" );
        i++;
        list.add( "i的值为" + i );
        list.add( "port:" + port );
        return list;
    }

}
