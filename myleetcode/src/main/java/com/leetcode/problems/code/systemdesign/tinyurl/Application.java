package com.leetcode.problems.code.systemdesign.tinyurl;

import com.leetcode.problems.code.systemdesign.tinyurl.repository.URLRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
//@SpringBootApplication  is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan
public class Application {

  public static void main(String[] args){
    SpringApplication.run(Application.class,args);
  }

}
