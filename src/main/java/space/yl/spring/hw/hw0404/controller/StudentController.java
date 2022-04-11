package space.yl.spring.hw.hw0404.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import space.yl.spring.hw.hw0404.entity.Student;
import space.yl.spring.hw.hw0404.service.StudentService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 简单学生信息表(Student)表控制层
 *
 * @author
 * @since 2022-03-29 17:42:04
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    /**
     * 使用表单提交 新增数据 后端直接使用对象接收也可以
     * 要求属性与key保持一致
     *
     * @param student 实体
     * @return 新增结果
     */
    @RequestMapping("/add")
    public String add(Student student, Model model) {

        int flag = studentService.insert(student);
        if (flag > 0) {
            model.addAttribute("flag","插入成功!");
            return "success";
        }
        model.addAttribute("flag","插入失败!");

        return "fail";
    }


    /**
     * 接收请求行请求参数
     * 多个形参一一对应接收实参数据
     * 如果形参名与实参名字一致,则会自动匹配,如果不一致 则需要@RequestParam指定对应关系
     *
     * @param name
     * @param englishName
     * @param address
     * @param phone
     */
    @RequestMapping("/add01")
    public void add01(String name, String englishName, String address,
                      @RequestParam(value = "phoneNumber",required = false) String phone) {
        System.out.println(name);
        System.out.println(englishName);
        System.out.println(address);
        System.out.println(phone);
    }

    /**
     * @Requestheader 如果是请求头传值 则该注解必须配置
     * 使用ajax提交
     */
    @RequestMapping("/requestHead")
    public void requestHead(@RequestHeader("eye") String eye,
                            @RequestHeader("hair") String hair,
                            @RequestHeader("Referer") String aaa) {
        System.out.println(eye);
        System.out.println(hair);
        System.out.println(aaa);

    }


    /**
     * @RequestBody 如果是请求体传值 可以使用实体类去接收,其属性名字与请求体名字一致
     * 该注解依赖于jackson解析 故pom.xml中需要引入jackson的maven依赖坐标
     * 使用ajax提交
     */
    @RequestMapping("/requestBody")
    public void requestBody(@RequestBody Student student) {
        System.out.println(student.getName());

    }

    /**
     * 前后端均用对象格式传输数据 则使用默认配置 不必做额外处理,但要求属性(字段保持一致)
     *
     * @param student
     */
    @RequestMapping("/requestBody01")
    public void requestBody01(Student student) {
        System.out.println(student.getName());

    }


    /**
     * 控制器响应一个页面
     *
     * @param student
     * @return
     */
    @RequestMapping("/addOrNo")
    public String addOrNo(Student student, Model model) {
        int flag = studentService.insert(student);
        //向页面封装响应数据
        model.addAttribute("flag", flag);
        return flag > 0 ? "success" : "fail";
    }


    /**
     * 控制器响应一个页面
     *
     * @param student
     * @return
     */
    @RequestMapping("/useModelAndView")
    public ModelAndView useModelAndView(Student student) {
        int flag = studentService.insert(student);
        ModelAndView success = new ModelAndView("success");
        success.addObject("flag", flag);
        ModelAndView fail = new ModelAndView("fail");
        fail.addObject("flag", flag);
    /*    return flag > 0 ? new ModelAndView("/page/success.jsp").addObject("flag", flag)
                : new ModelAndView("/page/fail.jsp").addObject("flag", flag);
    */
        return flag > 0 ? success : fail;
    }

    /**
     * 使用HttpServletResponse对象响应ajax异步请求
     *
     * @param student
     * @param response
     * @throws IOException
     */
    @RequestMapping("/useResponse")
    public void useResponse(@RequestBody Student student,
                            HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        //将Student对象转换为JSON格式字符串
        String studentJsonStr = new ObjectMapper().writeValueAsString(student);
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        writer.println(studentJsonStr);
        writer.flush();
        writer.close();

    }

    /**
     * 使用自定义类型接收参数
     * 使用自定义类型响应ajax异步请求
     *
     * @param student
     */
    @RequestMapping("/useOurType")
    @ResponseBody
    public Student useOurType(Student student) {
        student.setEnglishName("Jeffffffff");
        return student;
    }

    @RequestMapping("/test")
    public void test() {
        System.out.println("test...");
    }

}

