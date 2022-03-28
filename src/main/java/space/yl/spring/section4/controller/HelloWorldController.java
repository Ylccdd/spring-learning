package space.yl.spring.section4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类上加controller注解 包含Component注解
 * 把类作为实例对象交给
 *
 * @RequestMapping 相当于servlet 前端请求匹配方法
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping("/world")
    public void showHelloWorld() {
        System.out.println("Hello World");
    }
}
