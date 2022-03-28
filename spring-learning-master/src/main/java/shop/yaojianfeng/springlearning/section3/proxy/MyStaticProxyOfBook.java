package shop.yaojianfeng.springlearning.section3.proxy;

import shop.yaojianfeng.springlearning.section3.service.impl.BookServiceImpl02;

/**书籍的 静态代理
 * @author yaojianfeng
 */
public class MyStaticProxyOfBook {

    private BookServiceImpl02 bookService = new BookServiceImpl02();

    /**
     * 增加
     */
    public void insertBook(){
        beginTransaction();
        bookService.insertBook();
        commitTransaction();
    };

    /**
     * 删除
     */
    public void deleteBook(){
        beginTransaction();
        bookService.deleteBook();
        commitTransaction();
    };


    /**
     * 更新
     */
    public void updateBook(){
        beginTransaction();
        bookService.updateBook();
        commitTransaction();
    };


     void beginTransaction(){
        System.out.println("----开启事务---");
    };

     void commitTransaction(){
        System.out.println("----提交事务---");
        System.out.println("=======================");
    }
}
