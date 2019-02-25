package com.ai.sd.wzwPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: 潘旭东
 * @Date: 2019/2/23 11:23
 * @remark bug no no no
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ai.sd.wzwPortal"))//api接口包扫描路径
                .paths(PathSelectors.any())//可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .build();
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("沃掌握门户Swagger")//设置文档的标题
                .description("沃掌握门户Swagger接口调试UI")//文档的描述
                .termsOfServiceUrl("http://localhost:8080/swagger-ui.html")//设置文档的License信息
                .contact(new Contact("亚信科技CUC事业部山东PSO", "https://www.asiainfo.com/zh_cn/overview.html", "panxd@asiainfo.com"))//设置文档的联系方式
                .version("1.0.0")//设置文档的版本信息
                .build();
    }
    
}
