package com.ikuta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
/**
 * @author Ikuta
 * @classname
 * @date 2020/12/23 11:40
 * @email 934442950@qq.com
 */
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
