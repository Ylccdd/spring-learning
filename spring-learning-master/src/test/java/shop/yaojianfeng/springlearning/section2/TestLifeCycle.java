package shop.yaojianfeng.springlearning.section2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shop.yaojianfeng.springlearning.common.dao.TestDao;
import shop.yaojianfeng.springlearning.section2.entity.Customer;
import shop.yaojianfeng.springlearning.section2.entity.Student;

/**
 * 生命周期方法执行优先级 setter > afterPropertiesSet > init
 */
public class TestLifeCycle {
    /**
     * 测试 InitializingBean接口
     */
    @Test
    public void testInitAndDestroy() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student1 = appContext.getBean("student1", Student.class);
        System.out.println(student1.getName());
    }

    /**
     * 测试 init-method
     */
    @Test
    public void testInit() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Customer customer01 = appContext.getBean("customer01", Customer.class);
        Customer customer02 = appContext.getBean("customer02", Customer.class);

        TestDao testDao = appContext.getBean("testDao", TestDao.class);
        testDao.test();




    }
}
