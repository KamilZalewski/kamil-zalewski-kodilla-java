package com.kodilla.spring.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfiguration {
    @Bean
    public Calculator calculator() {
        return new Calculator(new Display());
    }
}
