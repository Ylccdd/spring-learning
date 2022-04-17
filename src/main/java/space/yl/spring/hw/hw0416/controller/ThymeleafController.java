package space.yl.spring.hw.hw0416.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Spring MVC集成使用 Thymeleaf
 * @author yaojianfeng
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    @RequestMapping("/hello")
    public String sayHello(Model model){

        model.addAttribute("helloMessage","Hello, welcome to use Thymeleaf 哈哈哈!!!");
        return "hello";
    }

}
