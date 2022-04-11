package space.yl.spring.hw.hw0404.service;


import space.yl.spring.hw.hw0404.entity.Student;


/**
 * 简单学生信息表(Student)表服务接口
 *
 * @author 
 * @since 2022-03-29 17:42:09
 */
public interface StudentService {

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    int insert(Student student);

}
