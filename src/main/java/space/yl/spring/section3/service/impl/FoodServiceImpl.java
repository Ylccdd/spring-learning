package space.yl.spring.section3.service.impl;

import org.springframework.stereotype.Component;
import space.yl.spring.section3.service.MyBaseService;

import java.util.List;

/**
 * @author yaojianfeng
 */
@Component
public class FoodServiceImpl implements MyBaseService {
    @Override
    public void insert() {
        System.out.println("---下单外卖----");
    }

    @Override
    public void delete() {
        System.out.println("---------取消订单--------");
    }

    @Override
    public void update() {
        System.out.println("---------备注订单------------");
    }

    @Override
    public List<Object> select() {
        return null;
    }
}
