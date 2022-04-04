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
    @RequestMapping("/world01")
    public void showHelloWorld01() {
        System.out.println("Hello World01");
    }
    @RequestMapping("/world02")
    public void showHelloWorld02() {
        System.out.println("Hello World02");
    }
    @RequestMapping("/world03")
    public void showHelloWorld03() {
        System.out.println("Hello World03");
    }

}
