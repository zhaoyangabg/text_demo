package cn.tx.ann_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigB {
    @Bean("bmw")
    public Car getBMW(){
        return new BMW();
    }
}
