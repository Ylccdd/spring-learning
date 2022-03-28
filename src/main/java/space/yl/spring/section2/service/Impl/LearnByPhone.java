package space.yl.spring.section2.service.Impl;

import space.yl.spring.section2.service.LearnMethod;

/**
 * 学习方式: 手机
 * @author yaojianfeng
 */
public class LearnByPhone implements LearnMethod {
    @Override
    public void learn() {
        System.out.println("通过手机进行学习...");
    }
}
