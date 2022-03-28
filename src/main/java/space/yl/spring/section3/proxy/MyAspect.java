package space.yl.spring.section3.proxy;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 简单切面类
 *
 * @author yaojianfeng
 */
public class MyAspect {
    public void before() {
        System.out.println("切点方法before执行了...");
    }

    public void after() {
        System.out.println("切点方法after执行了...");
    }

    public void afterReturn() {
        System.out.println("切点方法afterReturn执行了...");
    }
    public void afterThrowing() {
        System.out.println("切点方法afterThrowing执行了...");
    }


    /**
     * 环绕通知的切点方法,必须遵守如下定义规则:
     * 1. 必须带有一个 ProceedingJoinPoint类型的参数
     * 2.必须有Object类型的返回值
     * 3.在前后增强业务逻辑之间执行 Object proceed = point.proceed(); 代表连接点方法的执行
     * 4.返回 proceed 连接点(业务方法的返回值)
     * @param point
     * @return
     * @throws Throwable
     */
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知: 切入点方法执行之前的增强业务逻辑在此执行了...");


        Object proceed = point.proceed();


        System.out.println("环绕通知: 切入点方法执行之后的增强业务逻辑在此执行了...");
        return proceed;
    }
}
