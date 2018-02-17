package com.leetcode.problems.code.systemdesign.toyrobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@SpringBootApplication  is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan
public class Application {

  public static void main(String[] args){
    SpringApplication.run(Application.class,args);
  }

}

