package shop.yaojianfeng.springlearning.section3.service;

import shop.yaojianfeng.springlearning.section3.entity.MyBook;

import java.awt.print.Book;
import java.util.List;

/** 书籍服务类
 * @author yaojianfeng
 */
public interface BookService {
    /**
     * 增加
     */
    public void insertBook();

    /**
     * 删除
     */
    public void deleteBook();

    /**
     * 查找
     */
    public List<MyBook> selectBook();

    /**
     * 更新
     */
    public void updateBook();

}
