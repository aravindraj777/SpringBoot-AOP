package com.learining.springaop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    /**
     Suppose we need to add the logging, data sanitization, authentication etc , in these
     places we need to separate out the aspects.
     Here the aspects are :
      logging, authentication, data sanitization
     */
    public void checkout(String status){
        System.out.println("Checkout method from shopping cart called");
    }
}
