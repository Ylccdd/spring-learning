package shop.yaojianfeng.springlearning.section2.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 实现容器的感知类接口,可以调用容器的一些方法
 */
public class AppUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    /**
     * Spring自动注入
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        AppUtil.applicationContext = applicationContext;
    }

    public static <T> T getBean(String id, Class<T> requiredType) throws BeansException {
        return applicationContext.getBean(id, requiredType);
    }

}
