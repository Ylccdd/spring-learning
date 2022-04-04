package space.yl.spring.section4.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import shop.yaojianfeng.springlearning.section4.dao.DaoHelper;
import shop.yaojianfeng.springlearning.section4.dao.StudentDao;
import shop.yaojianfeng.springlearning.section4.entity.Student;

/**
 * Student 持久层实现
 *
 * @author yaojianfeng
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private DaoHelper helper;

    private final String tableName = "student";
    private final String baseField = "(sid,name,english_name,address,phone_number,birthday)";
//持久层调用daohelper
    @Override
    public int insert(Student student) {
        String sql= "insert into " + tableName + baseField +
                " values (" + "'" + student.getSid()
                + "','" + student.getName()
                + "','" + student.getEnglishName()
                + "','" + student.getAddress()
                + "'," + student.getPhoneNumber()
                + ",'" + student.getBirthday()
                + "');";
        return helper.insert(sql);
    }
}
