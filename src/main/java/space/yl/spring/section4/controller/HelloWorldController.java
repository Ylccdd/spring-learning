package space.yl.spring.section4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yaojianfeng
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping("/world")
    public void showHelloWorld() {
        System.out.println("Hello World");
    }
}
