package com.wuw.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: Swagger2
 * @Package com.wuw.demo
 * @Description:
 * @author: WUW
 * @date: 2019/4/1 22:16
 * @Copyright: 2019 www.freemud.cn Inc. All rights reserved.
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
     @Bean
     public Docket createRestApi() {
          return new Docket(DocumentationType.SWAGGER_2)
                 .apiInfo(apiInfo())
                   .select()
                  .apis(RequestHandlerSelectors.basePackage("com.wuw.demo"))
                   .paths(PathSelectors.any())
                     .build();
          }
     private ApiInfo apiInfo() {
               return new ApiInfoBuilder()
                      .title("Spring Boot中使用Swagger2构建RESTful APIs")
                       .description("Springboot +Swagger2：localhost:8080")
                      .termsOfServiceUrl("localhost:8080")
                    .contact("WUW")
                      .version("1.0")
                    .build();
     }
 }
