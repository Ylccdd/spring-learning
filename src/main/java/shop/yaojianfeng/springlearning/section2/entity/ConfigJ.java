package shop.yaojianfeng.springlearning.section2.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yaojianfeng
 */
@Configuration
public class ConfigJ {
    @Bean(initMethod = "init")
    public J j(){
        return new J();
    }
}
