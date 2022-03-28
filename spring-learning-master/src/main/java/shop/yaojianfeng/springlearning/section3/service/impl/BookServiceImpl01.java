package shop.yaojianfeng.springlearning.section3.service.impl;

import shop.yaojianfeng.springlearning.section3.entity.MyBook;
import shop.yaojianfeng.springlearning.section3.service.BookService;

import java.util.List;

/**
 * 书籍实现类 无代理
 * @author yaojianfeng
 */
public class BookServiceImpl01 implements BookService {

    @Override
    public void insertBook() {
        System.out.println("book---开启事务");
        System.out.println("插入book");
        System.out.println("book--提交事务");
        System.out.println("===============================");
    }

    @Override
    public void deleteBook() {
        System.out.println("book---开启事务");
        System.out.println("删除book");
        System.out.println("book--提交事务");
        System.out.println("===============================");

    }

    @Override
    public List<MyBook> selectBook() {
        return null;

    }

    @Override
    public void updateBook() {
        System.out.println("book---开启事务");
        System.out.println("更新book");
        System.out.println("book--提交事务");
        System.out.println("===============================");

    }


}
