package com.leetcode.problems.code.systemdesign.tinyurl;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.PathSelectors;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select().apis(RequestHandlerSelectors.basePackage("guru.springframework.controllers"))
        .paths(PathSelectors.regex("/myurlgenerator.*"))
        .build();
  }

}
