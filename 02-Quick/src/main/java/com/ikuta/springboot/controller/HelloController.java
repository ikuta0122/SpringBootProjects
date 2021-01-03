package com.ikuta.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController相当于@ResponseBody + @Controller
@RestController
/**
 * @author Ikuta
 * @classname
 * @date 2021/1/4 5:53
 * @email 934442950@qq.com
 */
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
