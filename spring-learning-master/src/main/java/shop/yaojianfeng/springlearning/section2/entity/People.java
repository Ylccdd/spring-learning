package shop.yaojianfeng.springlearning.section2.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import shop.yaojianfeng.springlearning.section2.service.LearnMethod;

/**
 * 人
 *
 * @author yaojianfeng
 */
public class People {

    private LearnMethod learn;

    @Autowired
    @Qualifier("byPhone")
    public void setLearn(LearnMethod learn) {
        this.learn = learn;
    }

    public void study() {
        learn.learn();
    }
}
