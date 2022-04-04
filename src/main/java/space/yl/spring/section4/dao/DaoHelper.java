package space.yl.spring.section4.dao;

import org.springframework.stereotype.Component;
import shop.yaojianfeng.springlearning.common.util.MysqlUtil;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * 持久层辅助类
 *
 * @author yaojianfeng
 */
@Component
public class DaoHelper {
    private Statement getStatement(){
        try {
            return MysqlUtil.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 通用的插入方法 只用传入一条插入语句即可执行插入动作
     *
     * @param sql
     * @return
     */
    public int insert(String sql) {
        Statement statement = getStatement();
        int result = 0;
        try {
            result =  statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
