package com.learining.springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		ShoppingCart cart = context.getBean(ShoppingCart.class);
		cart.checkout("DELIVERED");
	}



}
