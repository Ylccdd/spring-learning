package space.yl.spring.section3.service;

import space.yl.spring.section3.entity.MyBook;

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
