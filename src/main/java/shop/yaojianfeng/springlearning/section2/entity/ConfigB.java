package shop.yaojianfeng.springlearning.section2.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * @author yaojianfeng
 */
@Configuration
@Import(ConfigJ.class)
public class ConfigB {
    @Bean
    @Scope("singleton")
    public B b(){
        return new B();
    }
}
