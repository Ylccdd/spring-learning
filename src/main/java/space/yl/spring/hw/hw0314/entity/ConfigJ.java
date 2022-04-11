package space.yl.spring.hw.hw0314.entity;

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
