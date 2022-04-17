package space.yl.spring.hw.hw0416.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import space.yl.spring.hw.hw0416.dao.DaoHelper;
import space.yl.spring.hw.hw0416.dao.StudentDao;
import space.yl.spring.hw.hw0416.entity.Student;


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
        String sql = "insert into " + tableName + baseField +
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
