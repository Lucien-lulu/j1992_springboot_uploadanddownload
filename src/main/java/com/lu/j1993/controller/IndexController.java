package com.lu.j1993.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/8/3.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }
}
