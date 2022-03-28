package shop.yaojianfeng.springlearning.section2;

import org.junit.jupiter.api.Test;
import shop.yaojianfeng.springlearning.section2.entity.Order;

/**
 * 紧耦合演示
 */
public class OrderTest {
    @Test
    public void orderTest() {
        Order order = new Order();
        order.showOrder();
    }
}
