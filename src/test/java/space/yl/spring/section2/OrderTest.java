package space.yl.spring.section2;

import org.junit.jupiter.api.Test;
import space.yl.spring.section2.entity.Order;

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
