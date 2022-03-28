package space.yl.spring.section3.service.impl;

import org.springframework.stereotype.Component;

import java.util.List;

/** 订单类 演示基于注解进行切面配置
 * @author yaojianfeng
 */
@Component
public class OrderServiceImpl   {


    public void insert() {
        System.out.println("----insert order----");
//        System.out.println(10/0);
    }



    public void delete() {
        System.out.println("----delete order----");
    }



    public int update(int i) {
        System.out.println("----update order----");
        return i;
    }


    public List<Object> select() {
        return null;
    }
}
