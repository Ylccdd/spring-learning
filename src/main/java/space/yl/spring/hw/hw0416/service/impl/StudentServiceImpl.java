package space.yl.spring.hw.hw0416.service.impl;

import org.springframework.stereotype.Service;
import space.yl.spring.hw.hw0416.dao.StudentDao;
import space.yl.spring.hw.hw0416.entity.Student;
import space.yl.spring.hw.hw0416.service.StudentService;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author yaojianfeng
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao dao;

    @Override
    public int insert(Student student) {
        student.setSid(UUID.randomUUID().toString());

        return dao.insert(student);
    }
}
