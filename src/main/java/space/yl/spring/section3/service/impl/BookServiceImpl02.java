package space.yl.spring.section3.service.impl;

import space.yl.spring.section3.entity.MyBook;
import space.yl.spring.section3.service.BookService;

import java.util.List;

/**书籍实现类 有代理
 * @author yaojianfeng
 */
public class BookServiceImpl02 implements BookService {
    @Override
    public void insertBook() {
        System.out.println("插入book");
    }

    @Override
    public void deleteBook() {
        System.out.println("删除book");
    }

    @Override
    public List<MyBook> selectBook() {
        return null;
    }

    @Override
    public void updateBook() {
        System.out.println("更新book");

    }
}
