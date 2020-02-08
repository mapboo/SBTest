package com.qunhong.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket saggerDocket() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
		ApiInfo apiInfo = new ApiInfoBuilder().title("Api接口文档") // 标题
				.description("©2018-2020 Copyright. Powered By qunhongtech.com") // 描述
				.contact(new Contact("", "", "")) // 联系方式
				.version("1.0") // 版本号
				.build();
		docket.apiInfo(apiInfo);
		// 设置只生成被Api这个注解注解过的Ctrl类中有ApiOperation注解的api接口的文档
		docket.select().apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).build();
		return docket;
	}

}
