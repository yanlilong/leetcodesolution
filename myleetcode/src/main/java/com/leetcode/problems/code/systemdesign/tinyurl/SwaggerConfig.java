package com.leetcode.problems.code.systemdesign.tinyurl;

import java.util.ArrayList;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import static com.google.common.collect.Lists.newArrayList;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.regex("/myurlgenerator.*"))
        .build()
        .apiInfo(apiInfo())
        .globalOperationParameters(newArrayList(new ParameterBuilder()
        .name("Authorization")
        .description("JWT Access Token")
        .modelRef(new ModelRef("String"))
        .parameterType("header")
        .required(true)
        .defaultValue("null")
        .build()));
  }
  private ApiInfo apiInfo(){
     return new ApiInfoBuilder()
    .title("TinyURL REEST API")
    .version("1.0.0")
    .description("this API Can create a short url through long url")
    .build();
  }
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/swagger-ui.html**").addResourceLocations("classpath:/META-INF/resources/swagger-ui.html");
    registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
  }

}
