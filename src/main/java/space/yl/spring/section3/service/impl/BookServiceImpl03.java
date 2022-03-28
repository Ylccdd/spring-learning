package space.yl.spring.section3.service.impl;

import space.yl.spring.section3.service.MyBaseService;

import java.util.List;

/**
 * 书籍实现类 实现通用类接口
 * @author yaojianfeng
 */
public class BookServiceImpl03 implements MyBaseService {
    @Override
    public void insert() {
        System.out.println("---添加book----03");
    }

    @Override
    public void delete() {
        System.out.println("---删除book----03");
    }

    @Override
    public void update() {
        System.out.println("---更新book----03");
    }

    @Override
    public List<Object> select() {
        System.out.println("----查询book-----03");
        return null;
    }
}
