package space.yl.spring.section2.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 简单学生类
 * 生命周期方法执行优先级 setter > afterPropertiesSet > init
 *      后执行的方法可以更改之前的值
 * @author yaojianfeng
 */
public class Student implements InitializingBean, DisposableBean {

    private String name;
    private Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    @Override
    public void destroy() {
        System.out.println("用于销毁之前释放资源的操作在这里进行");
    }

    public void display(){
        System.out.println("name = " +name);
        System.out.println(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("调用setter方法,设置name");
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("调用setter方法,设置address对象");
        this.address = address;
    }

    /**
     * 最终使用之前调用
     */
    public void init() {
        System.out.println("初始化方法调用,对象被使用之前的准备工作在这里完成");
//        this.name = "zhangsan";
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("属性设置后,所进行的必要性操作可以在这里完成");
//        this.name = "lisi";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
