package shop.yaojianfeng.springlearning.common.dao.impl;

import shop.yaojianfeng.springlearning.common.dao.TestDao;

/**测试接口实现类
 * @author yaojianfeng
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
