package com.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Fremon on 2017/2/18.
 */
@RestController
@RequestMapping("/test/v1")
public class TestCtrl {
    @RequestMapping("fremon")
    public String test() {
        return "hello spring";
    }
    @RequestMapping("spring")
    public String spring() {
        return "spring zhen tmd nan yong";
    }
}
