package com.learining.springaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 In order to enable the aspect we need to annotate and enable it through @EnableAspectJAutoProxy
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class BeanConfig {
}
