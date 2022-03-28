package space.yl.spring.section3.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 * @author yaojianfeng
 */
public class MyJdkDynamicProxy  implements InvocationHandler {
    /**
     * 被代理对象
     */
    private Object object;

    public MyJdkDynamicProxy(Object object) {
        this.object = object;
    }

    /**
     * 生成代理对象
     *
     * @return
     */
    public Object getProxy() {
        //获取被代理对象的类加载器
        ClassLoader classLoader = object.getClass().getClassLoader();
        //获取被代理对象的类实现的接口
        Class<?>[] interfaces = object.getClass().getInterfaces();
        //获取增强处理器 用于被代理类的方法的增强(回调方法) this


        //产生代理对象并返回
        return Proxy.newProxyInstance(classLoader, interfaces, this);
    }

    private void beginTransaction() {
        System.out.println("----开启事务---");
    }


    private void commitTransaction() {
        System.out.println("----提交事务---");
        System.out.println("=======================");
    }

    /**
     * 使用代理对象调用方法,并不会执行调用的方法,而是进入到创建代理对象时指定的InvocationHandler类中的invoke方法
     * 被调用的的方法作为一个Method对象,传递到invoke的方法参数method里
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行代理类中的增强方法....");
        beginTransaction();
        //执行被代理类所需要执行的方法
        Object value = method.invoke(object, args);

        commitTransaction();
        return value;
    }


}
