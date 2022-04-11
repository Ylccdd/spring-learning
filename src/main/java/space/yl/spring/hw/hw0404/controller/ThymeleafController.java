package space.yl.spring.hw.hw0404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import space.yl.spring.hw.hw0404.entity.Student;

import javax.servlet.http.HttpSession;
import java.util.UUID;

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


    @RequestMapping("/varEL")
    public String varEL(Model model, HttpSession session){
        model.addAttribute("result",100+200);
        Student student01 = new Student();
        student01.setName("Jeff");
        student01.setPhoneNumber("18039670878");
        model.addAttribute("student01",student01);
        Student student02 = new Student();
        student02.setName("Jack");
        student02.setAddress("河南财经政法大学");
        session.setAttribute("student02",student02);
        return "thymeleaf_EL";
    }

    @RequestMapping("/urlEL")
    public String varEL(){
        return "url_el";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/literal")
    public String literal(Model model){
        Student student = new Student();
        student.setSid(UUID.randomUUID().toString());
        model.addAttribute("student",student);
        return "literal";
    }

}
