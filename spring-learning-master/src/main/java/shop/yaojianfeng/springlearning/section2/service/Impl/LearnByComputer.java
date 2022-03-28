package shop.yaojianfeng.springlearning.section2.service.Impl;

import shop.yaojianfeng.springlearning.section2.service.LearnMethod;

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
