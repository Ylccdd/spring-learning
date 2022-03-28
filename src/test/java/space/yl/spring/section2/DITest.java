package space.yl.spring.section2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import space.yl.spring.section2.entity.*;
import space.yl.spring.section2.interfacePackage.Printable;
import space.yl.spring.section2.entity.*;

/**
 * 依赖注入测试类
 */
public class DITest {

    @Test
    void testJava(){
       /* Customer customer = new Customer();
        customer.setCname("jianxiao");
        customer.setCid("100");
        customer.display();
*/
        Student student = new Student();
        Student student1 = new Student("lisi", new Address("中国", "河南"));
        student1.display();

/*
        Address address = new Address();
        address.setCountry("China");
        student.setAddress(address);
        student.setName("zhangsan");

        student.display();*/

//        Employee<Object> objectEmployee = new Employee<>();

    }

    /**
     * 使用setter注入简单值
     */
    @Test
    void testSetter01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Customer customer03 = applicationContext.getBean("customer03", Customer.class);
        customer03.display();
        Customer customer04 = applicationContext.getBean("customer04", Customer.class);
        customer04.display();
    }

    /**
     * 使用setter注入对象
     */
    @Test
    void testSetter02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Student student01 = applicationContext.getBean("student01", Student.class);
        student01.display();
    }

    /**
     * 使用setter注入集合(简单字符串)
     */
    @Test
    void testSetter03() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Question question01 = applicationContext.getBean("question01", Question.class);
        question01.display();
    }

    /**
     * 使用setter注入集合(引用对象)
     */
    @Test
    void testSetter04() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Question question02 = applicationContext.getBean("question02", Question.class);
        question02.display();
    }

    /**
     * 使用setter注入Map
     */
    @Test
    void testSetter05() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Question question03 = applicationContext.getBean("question03", Question.class);
     /*   Map answers = (Map) question03.getAnswers();
        Set<String> set = answers.keySet();
        for (String o : set) {
            System.out.println(answers.get(o));
        }*/
        question03.display();
    }

    /**
     * 测试 使用构造函数注入简单值
     */
    @Test
    void testConstructor01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Employee emp01 = applicationContext.getBean("emp01", Employee.class);
        emp01.show();
    }

    /**
     * 测试 使用构造函数注入引用类型(对象)
     */
    @Test
    void testConstructor02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Employee emp02 = applicationContext.getBean("emp02", Employee.class);
        emp02.show();
    }

    /**
     * 测试 使用构造函数注入引用类型(集合)
     */
    @Test
    void testConstructor03() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Employee emp03 = applicationContext.getBean("emp03", Employee.class);
        emp03.show();
    }

    /**
     * 测试 使用构造函数注入引用类型(集合)
     */
    @Test
    void testConstructor04() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Employee emp04 = applicationContext.getBean("emp04", Employee.class);
        emp04.show();
    }
    /**
     * 测试 使用构造函数注入引用类型(集合)
     */
    @Test
    void testConstructor05() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Employee emp05 = applicationContext.getBean("emp05", Employee.class);
        emp05.show();
    }

    /**
     * 测试使用工厂方法注入
     */
    @Test
    void testFactoryDI01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        SingletonA instance = SingletonA.getInstance();
        System.out.println(instance);
        SingletonA singleA = applicationContext.getBean("singleA", SingletonA.class);
        System.out.println(singleA);
    }
    /**
     * 测试使用工厂方法注入
     */
    @Test
    void testFactoryDI02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Printable printable = applicationContext.getBean("printable", Printable.class);
        printable.print();
    }

    /**
     * 测试使用工厂方法注入
     */
    @Test
    void testFactoryDI03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        Printable printable = applicationContext.getBean("printImpl", Printable.class);
        printable.print();
    }

    /**
     * 测试通过名字自动装配 需要名字保持一致
     */
    @Test
    void testByName(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        AutoA autoA = context.getBean("byNameDemo", AutoA.class);
        autoA.display();
    }

    /**
     * 测试通过类型自动注入
     */
    @Test
    void testByType(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        AutoA autoA = context.getBean("byTypeDemo", AutoA.class);
        autoA.display();
    }
    @Test
    void testByConstructor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
        AutoA autoA = context.getBean("byConstructor", AutoA.class);
        autoA.display();
    }

    /**
     * 测试通过注解进行注入
     */
    @Test
    void testAnnotationSection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-section2.xml");
      /*  StudentImpl student = context.getBean("studentImpl01", StudentImpl.class);
        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(student.getAge());*/
        System.out.println("==============以下是测试Autowire=========================");
        TextEditor textEditor = context.getBean("textEditor", TextEditor.class);
        textEditor.spellCheck();
      /*  System.out.println("==============以下是测试Qualifier=========================");
        People people01 = context.getBean("people01", People.class);
        people01.study();*/
    }

    /**
     * 测试通过Java方式进行注入
     */
    @Test
    void testJavaAnnotationSection01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld bean = context.getBean(HelloWorld.class);
        bean.setMessage("Hello Java!");
        bean.display();
    }
    @Test
    void testJavaAnnotationSection02(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigB.class);
        B b = context.getBean(B.class);
        B b1 = context.getBean(B.class);
        b.display();
        b1.display();
        J j = context.getBean(J.class);
        j.display();

    }

}
