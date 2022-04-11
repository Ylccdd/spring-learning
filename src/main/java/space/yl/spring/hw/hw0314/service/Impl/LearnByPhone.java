package space.yl.spring.hw.hw0314.service.Impl;

import space.yl.spring.hw.hw0314.service.LearnMethod;

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
