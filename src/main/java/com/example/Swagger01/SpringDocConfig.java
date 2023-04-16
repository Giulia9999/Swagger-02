package com.example.Swagger01;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@OpenAPIDefinition
@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI baseOpenAPI(){
        return new OpenAPI().info(new Info()
                        .title("Simple Swagger example")
                        .version("1.0.0")
                        .description("Swagger API documentation")
                        .contact(new Contact()
                                .name("Giulia")
                                .url("https://develhope.co")
                                .email("Giulia@live.it")))
                .tags(List.of(new Tag().name("name-controller")));
    }
}
