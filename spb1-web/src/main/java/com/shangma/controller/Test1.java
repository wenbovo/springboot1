package com.shangma.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BOGEY
 * 2022/7/12  22:53
 */

@Component
@RestController
public class Test1 {

    @GetMapping("test")
    public String test1(){
        return "success";
    }

}
