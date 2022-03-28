package space.yl.spring.section3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import space.yl.spring.section3.entity.StudentCanDo;
import space.yl.spring.section3.entity.Teacher;

/**
 * 测试spring基于XML实现AOP
 */
public class SpringXmlAopTest {
    /**
     * 只针对某个类的某个特定的方法
     */
    @Test
    void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-section3.xml");
        Teacher teacher01 = (Teacher) context.getBean("teacher01");

        teacher01.teach();
//        teacher01.showException();
//        System.out.println("===========================");
        StudentCanDo canDo = (StudentCanDo) context.getBean("studentCanDo01");
        canDo.study01();
//        canDo.study02();
//        System.out.println("==============================");
//        canDo.eat01();
//        canDo.rest01();
    }

    /**
     * 针对某个类的所有方法
     */
    @Test
    void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-section3.xml");
        Teacher teacher01 = (Teacher) context.getBean("teacher01");
        teacher01.teach();
        teacher01.setName("Garry");
        String name = teacher01.getName();
        System.out.println(name);
    }

    /**
     * 通知策略
     */
    @Test
    void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-section3.xml");
        Teacher teacher01 = (Teacher) context.getBean("teacher01");
        teacher01.teach();
        teacher01.showException();

    }


}
