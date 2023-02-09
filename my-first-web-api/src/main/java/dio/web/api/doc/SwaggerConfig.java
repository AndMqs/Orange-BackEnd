package dio.web.api.doc;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerConfig {
  @Bean
  public OpenAPI springBlogPessoalOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Primeiro Projeto com Swagger")
            .description(" - Documentando API Rest com Swagger usando Spring Boot Framework 3.0.2")
            .version("v0.0.1")
            .license(new License()
                .name("Web Project with Spring Boot Web")
                .url("https://github.com/AndMqs"))
            .contact(new Contact()
                .name("Andresa ")
                .url("https://www.linkedin.com/in/andresa-marques-dev/")
                .email("andresa.b.marques@hotmail.com")))
        .externalDocs(new ExternalDocumentation()
            .description("My Github")
            .url("https://github.com/AndMqs"));
  	}
	@Bean
	public Docket detalheApi() {
	Docket docket = new Docket(DocumentationType.SWAGGER_2);
	 
		docket
		.select()
		.apis(RequestHandlerSelectors.basePackage("dio.web.api.controller"))
		.paths(PathSelectors.any())
		.build()
		.consumes(new HashSet<String>(Arrays.asList("application/json")))
		.produces(new HashSet<String>(Arrays.asList("application/json")));
		
		return docket;
	}
	
}