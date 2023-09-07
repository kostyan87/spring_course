package com.ignatev.spring_core.javacodeconfig.method1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ignatev.spring_core.javacodeconfig.method1")
@PropertySource("classpath:myApp.properties")
public class Config {
}
