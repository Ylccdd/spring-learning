package space.yl.spring.hw.hw0314.service.Impl;

import space.yl.spring.hw.hw0314.service.LearnMethod;

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
