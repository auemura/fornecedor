package br.com.alex.microservice.fornecedor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfiguration {
	@Bean
	public Docket apiV1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("v1")
                .select()
                    .apis(RequestHandlerSelectors.basePackage("br.com.alex.microservice.fornecedor.controller"))
                .build()
                .apiInfo(new ApiInfoBuilder()                        
                        .title("Fornecedor")
                        .description("Servi�o de informa��es de fornecedores")
                        .build());
    }
}