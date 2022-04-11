package space.yl.spring.hw.hw0404.dao;


import space.yl.spring.hw.hw0404.entity.Student;

/**
 * 简单学生信息表(Student)表数据库访问层
 *
 * @author 
 * @since 2022-03-29 17:42:09
 */
public interface StudentDao {

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 影响行数
     */
    int insert(Student student);

}

