package space.yl.spring.section4.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import space.yl.spring.section4.entity.Student;
import space.yl.spring.section4.service.StudentService;

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
    public String add(Student student) {
        //student对象实体类里的名字和前端返回的name属性一一对应
        //mvc部分框架直接实现
        int flag = studentService.insert(student);
        if (flag>0){
            //返回页面时转发思路可以 将返回值定义为string,然后写成如下形式
            return "success";
            //重定向写法
            //请求转发和重定向的区别:转发是服务器内部只有一次请求,重定向有两次请求
            //return "redirect:/page/success.jsp";
        }
        return "fail";
    }


    /**接收请求行请求参数
     * 多个形参一一对应接收实参数据
     * 如果形参名与实参名字一致,则会自动匹配,如果不一致 则需要@RequestParam指定对应关系
     * @param name
     * @param englishName
     * @param address
     * @param phone
     */
    @RequestMapping("/add01")
    public void add01(
             String name,
             String englishName,
             String address,
             @RequestParam("phoneNumber") String phone ) {
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
    public void requestHead(@RequestHeader("eye") String eye){
        //
        System.out.println(eye);

    }


    /**
     * @RequestBody 如果是请求体传值 可以使用实体类去接收,其属性名字与请求体名字一致
     * 该注解依赖于jackson解析 故pom.xml中需要引入jackson的maven依赖坐标
     * 使用ajax提交
     */
    @RequestMapping("/requestBody")
    public void requestBody(@RequestBody Student student){
        //把json字符串转化为类对象
        System.out.println(student.getName());

    }

    /**
     * 前后端均用对象格式传输数据 则使用默认配置 不必做额外处理,但要求属性(字段保持一致)
     * @param student
     */
    //使用ajax不带注解
    @RequestMapping("/requestBody01")
    public void requestBody01(Student student){
        System.out.println(student.getName());

    }




    /**
     * 控制器响应一个页面
     * @param student
     * @return
     */
    @RequestMapping("/addOrNo")
    //model导入视图层spring开头的类,model可以向页面封装数据,数据流向交给springmvc,封装交给jsp
    //比起jsp少了resq对象
    public String addOrNo(Student student, Model model) {
        int flag = studentService.insert(student);
        //向页面封装响应数据
        model.addAttribute("flag",flag);
    //重定向无法获得
//        return flag>0 ? "/page/success.jsp":"/page/fail.jsp";
        return flag>0 ? "success":"fail";
    }


    /**
     * 控制器响应一个页面
     * @param student
     * @return
     */
    //表单提交通过ModelAndView
    @RequestMapping("/useModelAndView")
    public ModelAndView useModelAndView(Student student) {
        int flag = studentService.insert(student);
        return flag>0? new ModelAndView("success").addObject("flag",flag)
                :new ModelAndView("fail").addObject("flag",flag);
    }

    /**
     * 使用HttpServletResponse对象响应ajax异步请求
     * @param student
     * @param response
     * @throws IOException
     */
    @RequestMapping("/useResponse")
    public void useResponse(@RequestBody
                            Student student,
                            HttpServletResponse response) throws IOException {
        //@RequestBody Student student,前端传回对象
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
     * @param student
     */
    @RequestMapping("/useOurType")
    @ResponseBody
    //相较于上面使用response响应,springmvc直接返回对象
    //需要使用 @ResponseBody 注解
    public Student useOurType(Student student)   {
      return student;
    }

    public void test(){
        System.out.println("test...");
    }

}

