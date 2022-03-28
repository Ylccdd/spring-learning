package space.yl.spring.common.factory;

import space.yl.spring.common.dao.TestDao;
import space.yl.spring.common.dao.impl.TestDaoImpl;

public class StaticFactory {
    //对象工厂
    public static TestDao getTestDao(){
        return new TestDaoImpl();
    }
}
