package space.yl.spring.section3.proxy;

import space.yl.spring.section3.service.MyBaseService;

/**基于实现了 MyBaseService接口的 静态代理
 * @author yaojianfeng
 */
public class MyStaticProxy {

    /**
     * 被代理对象的引用
     */
    private MyBaseService service;
    
    public MyStaticProxy(MyBaseService service){
        this.service = service;
    }

    /**
     * 增加
     */
    public void insert(){
        beginTransaction();
        service.insert();
        commitTransaction();
    };

    /**
     * 删除
     */
    public void delete(){
        beginTransaction();
        service.delete();
        commitTransaction();
    };


    /**
     * 更新
     */
    public void update(){
        beginTransaction();
        service.update();
        commitTransaction();
    };


     void beginTransaction(){
        System.out.println("----开启事务---");
    };

     void commitTransaction(){
        System.out.println("----提交事务---");
        System.out.println("=======================");
    }
}
