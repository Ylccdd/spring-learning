package shop.yaojianfeng.springlearning.section3.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * CGLib 动态代理 生成被代理对象的子类作为代理对象
 *
 * @author yaojianfeng
 */
public class MyCgLibProxy implements MethodInterceptor {

    private Object object;

    public MyCgLibProxy(Object object) {
        this.object = object;
    }


    /**
     * 获取代理对象
     * @return
     */
    public Object getProxy() {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);

        return enhancer.create();

    }


    /**
     * 真正的做业务增强的地方
     * @param o
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        beginTransaction();
        Object value = method.invoke(object, args);
        syslog();
        commitTransaction();
        return value;
    }

    private void beginTransaction() {
        System.out.println("----开启事务---");
    }


    private void commitTransaction() {
        System.out.println("----提交事务---");
        System.out.println("=======================");
    }

    private void syslog(){
        System.out.println("---插入日志--- ");
    }

    private void computeTime(){
        System.out.println("调用时间的记录");
    }

}
