package com.learining.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    /**
     In the before annotation we need to specify the package name, then the method we need to call.
     (*) is used as it accepts any return type .
     */
    @Before("execution(* com.learining.springaop.ShoppingCart.checkout(..))")
    public void logger(){
        System.out.println("Logger");
    }


    /**
     In the @After annotation in execution method for
     (*) - any return type
     (*) - any package
     (*) - any class
     if there is a checkout method of any return type in any package, any class ,we have to run
     this aspect afterLogger() method.
      */
    @After("execution(* *..checkout(..))")
    public void afterLogger() {
        System.out.println("After logger");
    }


}
