package shop.yaojianfeng.springlearning.section3.service.impl;

import shop.yaojianfeng.springlearning.section3.service.MyBaseService;

import java.util.List;

/**
 * @author yaojianfeng
 */
public class ProductServiceImpl implements MyBaseService {
    @Override
    public void insert() {
        System.out.println("----product insert----");
    }

    @Override
    public void delete() {
        System.out.println("----product delete----");
    }

    @Override
    public void update() {
        System.out.println("----product update----");
    }

    @Override
    public List<Object> select() {
        return null;
    }
}
