package space.yl.spring.hw.hw0314.entity;

/**简单 单例模式示例
 * @author yaojianfeng
 */
public class SingletonA {
    private static final SingletonA INSTANCE = new SingletonA();

    private SingletonA(){
        System.out.println("私有构造器,内部调用,已被执行了...");
    }

    /**
     * 静态工厂方法
     * @return 当前类实例
     */
    public static SingletonA getInstance() {
        System.out.println("返回实例对象");
        return INSTANCE;
    }
}
