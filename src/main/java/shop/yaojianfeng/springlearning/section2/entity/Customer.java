package shop.yaojianfeng.springlearning.section2.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/** 客户类
 * @author yaojianfeng
 */
public class Customer {
    private String cname;
    private String cid;

    public Customer(String cname, String cid) {
        this.cname = cname;
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        System.out.println("设置了Customer对象的名字 =="+cname);
        this.cname = cname;
    }



    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Customer (){
        System.out.println("新创建了一个客户类" + this.hashCode());
    }

   /* public void init(){
        System.out.println(" Customer  init() invoked...");
    }
    public void init01(){
        System.out.println(" Customer  init01() invoked...");
    }*/

    /**
     * 不常用 多被method-init替换
     */
    @PostConstruct
    public void postConstructTest(){
        System.out.println(" Customer  postConstructTest() invoked...");
    }


    @PreDestroy
    public void destroy(){
        System.out.println("Method customerDestroy invoked...");
    }


    public void display() {

        System.out.println("cname="+cname+" cid="+cid);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer{");
        sb.append("cname='").append(cname).append('\'');
        sb.append(", cid='").append(cid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
