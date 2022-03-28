package space.yl.spring.section3.service.impl;

import space.yl.spring.section3.service.MyBaseService;

import java.util.List;

/**
 * @author yaojianfeng
 */
public class UserServiceImpl implements MyBaseService {
    @Override
    public void insert() {
        System.out.println("-----添加用户-----");
    }

    @Override
    public void delete() {
        System.out.println("----删除用户-----");
    }

    @Override
    public void update() {
        System.out.println("----更新用户----");
    }

    @Override
    public List<Object> select() {
        System.out.println("------查询用户列表----");
        return null;
    }
}
