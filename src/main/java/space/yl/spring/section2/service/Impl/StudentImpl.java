package space.yl.spring.section2.service.Impl;

import org.springframework.beans.factory.annotation.Required;
import space.yl.spring.section2.entity.Student;
import space.yl.spring.section2.service.LearnMethod;

/**学生类
 * @author yaojianfeng
 */
public class StudentImpl extends Student implements LearnMethod {

    private int age;

    @Override
    public void learn() {
        System.out.println("学生通过听老师讲课进行学习...");
    }

    @Required
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
