package com.ikuta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication来标注一个主程序类,说明这是一个SpringBoot应用
 */
@SpringBootApplication
/**
 * @author Ikuta
 * @classname
 * @date 2020/12/23 11:36
 * @email 934442950@qq.com
 */
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //Spring应用启动
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
