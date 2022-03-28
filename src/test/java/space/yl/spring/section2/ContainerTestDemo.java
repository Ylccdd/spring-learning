package space.yl.spring.section2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import space.yl.spring.common.dao.TestDao;
import space.yl.spring.common.dao.impl.TestDaoImpl;
import space.yl.spring.section2.util.AppUtil;
import space.yl.spring.section2.entity.Student;

/**
 * IOC容器 相关测试
 */
public class ContainerTestDemo {
    /**
     * 使用Resource对象 加载配置
     */
    @Test
    public void useResource(){
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        TestDao testDao = beanFactory.getBean("testDao", TestDaoImpl.class);
        testDao.test();
    }
    /**
     * 测试 BeanFactory
     */
    @Test
    public void showBeanFactory() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDao = beanFactory.getBean("testDao", TestDaoImpl.class);
        System.out.println(testDao);
        testDao.test();
    }

    /**
     * 测试 ApplicationContext
     */
    @Test
    public void showApplicationContext() {
        // 可以使用ctrl + h 显示对应的子类型
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDao = appContext.getBean("testDao", TestDaoImpl.class);
        System.out.println(testDao);
        System.out.println(testDao.hashCode());
        testDao.test();

        }

    @Test
    public void useFileSystem() {
        // 可以使用ctrl + h 显示对应的子类型
        ApplicationContext appContext = new FileSystemXmlApplicationContext("D:\\workspace\\mySpring\\spring-learning\\src\\main\\resources\\applicationContext.xml");
        TestDao testDao = appContext.getBean("testDao", TestDaoImpl.class);
        System.out.println(testDao);
        testDao.test();
    }

    /**
     * 测试Scope
     */
    @Test
    public void testScope() {
        // 可以使用ctrl + h 显示对应的子类型
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDao = appContext.getBean("testDao", TestDaoImpl.class);
        System.out.println(testDao);
        System.out.println(testDao.hashCode());
        testDao.test();

        TestDaoImpl testDao1 = appContext.getBean("testDao", TestDaoImpl.class);
        System.out.println(testDao1);
        System.out.println(testDao1.hashCode());
        testDao1.test();
        System.out.println(testDao.equals(testDao1));

    }


    /**
     * 测试 Aware接口
     */
    @Test
    public void testAware() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student1 = AppUtil.getBean("student1", Student.class);
        student1.getName();
    }

}
