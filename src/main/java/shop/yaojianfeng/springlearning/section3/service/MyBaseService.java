package shop.yaojianfeng.springlearning.section3.service;

import java.util.List;

/**通用对象服务类
 * @author yaojianfeng
 */
public interface MyBaseService {
    /**
     * 增加
     */
    public void insert();

    /**
     * 删除
     */
    public void delete();

    /**
     * 更新
     */
    public void update();

    /**
     * 查询
     * @return 集合
     */
    public List<Object> select();
}
