package space.yl.spring.section3;

import org.junit.jupiter.api.Test;
import space.yl.spring.section3.entity.Teacher;
import space.yl.spring.section3.proxy.MyCgLibProxy;
import space.yl.spring.section3.proxy.MyJdkDynamicProxy;
import space.yl.spring.section3.proxy.MyStaticProxy;
import space.yl.spring.section3.proxy.MyStaticProxyOfBook;
import space.yl.spring.section3.service.BookService;
import space.yl.spring.section3.service.MyBaseService;
import space.yl.spring.section3.service.impl.*;

import space.yl.spring.section3.service.impl.BookServiceImpl01;
import space.yl.spring.section3.service.impl.ProductServiceImpl;
import space.yl.spring.section3.service.impl.ProductServiceImpl01;

/**
 * 代理模式测试类
 */
public class ProxyTest {

    /**
     * 没有代理的原始实现
     */
    @Test
    void test01() {
        BookService service = new BookServiceImpl01();
        service.deleteBook();
        service.insertBook();
        service.updateBook();
        service.selectBook();
    }

    /**
     * 静态代理的简单实现: 只能代理某个特定的类
     */
    @Test
    void test02() {
        MyStaticProxyOfBook proxyOfBook = new MyStaticProxyOfBook();
        proxyOfBook.insertBook();
        proxyOfBook.deleteBook();
        proxyOfBook.updateBook();
    }

    /**
     * 静态代理的简单实现: 代理实现了某个接口的类
     */
    @Test
    void test03() {
//        MyBaseService service = new UserServiceImpl();
//        MyBaseService service = new BookServiceImpl03();
        MyBaseService service = new ProductServiceImpl();

//       SysLogService service = new SyslogImpl();
        MyStaticProxy proxyService = new MyStaticProxy(service);
        proxyService.insert();
        proxyService.delete();
        proxyService.update();
    }

    /**
     * JDK的动态代理 基于接口生成代理对象
     */
    @Test
    void test04() {
        //被代理对象
//        MyBaseService service = new UserServiceImpl();
//        MyBaseService service = new BookServiceImpl03();
//        SysLogService service = new SyslogImpl();
        ProductServiceImpl01 service = new ProductServiceImpl01();
        //代理类对象
        MyJdkDynamicProxy myJdkDynamicProxy = new MyJdkDynamicProxy(service);
        //获取代理类的
        ProductServiceImpl01 proxy = (ProductServiceImpl01) myJdkDynamicProxy.getProxy();
        proxy.insert();
        proxy.delete();
//        proxy.update();
//        List<Object> select = proxy.select();
//        System.out.println(select);
    }


    /**
     * CGLib 的动态代理 生成被代理对象的子类作为代理对象
     */
    @Test
    void test05(){

        Teacher teacher = new Teacher("Jeff", "男");
//        StudentCanDo studentCanDo = new StudentCanDo();
//        Teacher proxy = (Teacher) new MyCgLibProxy(teacher).getProxy();
        Teacher proxy = (Teacher) new MyCgLibProxy(teacher).getProxy();
        proxy.teach();
//        proxy.insert();
//        proxy.eat01();
//        proxy.rest01();
//        proxy.study01();

    }


}
