package com.test.mdh.hib;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by maodihui on 2021/1/5
 */
@RestController
@RequestMapping("kx/register")
public class Register {

    /**
     * 登录凯旋
     */
    @GetMapping(value = "/hello")
    public String login(){

        return "Hello zkx";
    }





}
