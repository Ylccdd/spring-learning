package space.yl.spring.common.demoyl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import space.yl.spring.common.dao.TestDao;

public class UserDaoDemo {
    //psvm
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //无参构造实现对象
        TestDao testDao = (TestDao) app.getBean("testDao");
        testDao.test();
    }
}
