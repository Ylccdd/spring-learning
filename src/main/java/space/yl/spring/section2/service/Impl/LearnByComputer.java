package space.yl.spring.section2.service.Impl;

import space.yl.spring.section2.service.LearnMethod;

/**
 * 教师类
 * @author yaojianfeng
 */
public class LearnByComputer implements LearnMethod {
    @Override
    public void learn() {
        System.out.println("通过电脑进行学习...");
    }
}
