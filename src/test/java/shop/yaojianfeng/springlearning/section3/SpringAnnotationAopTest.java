package shop.yaojianfeng.springlearning.section3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shop.yaojianfeng.springlearning.section3.service.MyBaseService;
import shop.yaojianfeng.springlearning.section3.service.impl.BookServiceImpl03;
import shop.yaojianfeng.springlearning.section3.service.impl.OrderServiceImpl;

/**
 * Spring 基于注解实现AOP测试
 */
public class SpringAnnotationAopTest {
    private static ApplicationContext context;

    @BeforeAll
    static void testAnnotation(){
       context = new ClassPathXmlApplicationContext("applicationContext-section3.xml");
    }

    /**
     * 测试前置通知
     */
    @Test
    void testAnnotation01(){
        //使用具体类型接收 应用cglib动态代理策略
        OrderServiceImpl orderService = (OrderServiceImpl) context.getBean("orderServiceImpl");
//        OrderServiceImpl service = new OrderServiceImpl();
//        MyBaseService orderService = (MyBaseService) context.getBean("orderServiceImpl");
        //对无返回值方法进行增强
//        orderService.insert();
        //对有返回值方法进行增强
//        int update = orderService.update(10);
//        System.out.println(update);

//        使用接口接收  应用jdk动态代理
        MyBaseService service = (MyBaseService) context.getBean("foodServiceImpl");
        service.insert();

    }
}
