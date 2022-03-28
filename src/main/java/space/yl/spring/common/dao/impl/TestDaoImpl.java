package space.yl.spring.common.dao.impl;

import space.yl.spring.common.dao.TestDao;

/**无参构造实现对象
 * @author
 */
public class TestDaoImpl implements TestDao {
    @Override
    public void test() {
        System.out.println("test is running...");
    }

    @Override
    public void test01() {
        System.out.println("test01 method ...");
    }

    /**
     * 测试统一初始化方法
     */
    public void init(){
        System.out.println("TestDaoImpl init() invoked...");
    }

}
