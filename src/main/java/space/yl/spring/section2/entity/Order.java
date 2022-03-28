package space.yl.spring.section2.entity;

/**
 * 订单类
 *
 * @author yaojianfeng
 */
public class Order {
    private Product product;
    private Customer customer;
    private CreditCard creditCard;

    public Order() {
        this.product = new Product();
        this.customer = new Customer();
        this.creditCard = new CreditCard();
    }

    public void showOrder() {
        System.out.println("新创建了一个订单类" + this.hashCode());
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
}
