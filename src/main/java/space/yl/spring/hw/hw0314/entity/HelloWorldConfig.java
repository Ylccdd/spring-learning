package space.yl.spring.hw.hw0314.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**Configuration注解
 * @author yaojianfeng
 */
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
