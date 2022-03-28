package space.yl.spring.section3.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 基于注解的切面类
 *
 * @author yaojianfeng
 */
@Component
@Aspect
public class MyAnnotationAspect {

    /**
     * 配置切入点
     */
    @Pointcut("execution(* shop.yaojianfeng.springlearning.section3.service.impl.*.*(..))")
    public void pc1(){}

    @Pointcut("execution(int space.yl.spring.section3.service.impl.OrderServiceImpl.update(..))")
    public void pc2(){}



    @Before("pc1()")
    public void before() {
        System.out.println("切点方法before执行了...");
    }
    @Before("pc1()")
    public void before01() {
        System.out.println("切点方法before01执行了...");
    }

    @After("pc1()")
    public void after() {
        System.out.println("切点方法after执行了...");
    }

    /**
     * 可以使用业务方法的执行的返回值结果
     * @param a
     */
    @AfterReturning(value = "pc1()",returning = "b")
    public void afterReturn(int b) {
        System.out.println("切点方法afterReturn执行了...");
        System.out.println("使用的返回值是"+b);
    }


    @AfterThrowing("pc1()")
    public void afterThrowing() {
        System.out.println("切点方法afterThrowing执行了...");
    }


    /**
     * 环绕通知的切点方法,必须遵守如下定义规则:
     * 1. 必须带有一个 ProceedingJoinPoint类型的参数
     * 2.必须有Object类型的返回值
     * 3.在前后增强业务逻辑之间执行 Object proceed = point.proceed(); 代表切入点方法的执行
     * 4.返回 proceed
     *
     * @param point
     * @return
     * @throws Throwable
     */
    @Around("pc1()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知: 切入点方法执行之前的增强业务逻辑在此执行了...");
        long begin = System.currentTimeMillis();

        Object proceed = point.proceed();

        System.out.println("环绕通知: 切入点方法执行之后的增强业务逻辑在此执行了...");
        long end = System.currentTimeMillis();
        System.out.println("当前方法调用总耗时:" + (end-begin)+"毫秒");

        return proceed;
    }
}
