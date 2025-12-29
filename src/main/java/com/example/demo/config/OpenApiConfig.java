package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    public static final String SECURITY_SCHEME_NAME = "bearerAuth";

    @Bean
    public OpenAPI openAPI() {

        return new OpenAPI()

                // 🌐 Server URL (Swagger base URL)
                .servers(List.of(
                        new Server()
                                .url("https://9026.32procr.amypo.ai")
                                .description("Production Server")
                ))

                // API basic info
                .info(new Info()
                        .title("Smart Inventory Restock API")
                        .description("Spring Boot REST API secured with JWT")
                        .version("1.0.0")
                )

                // 🔐 Apply JWT globally
                .addSecurityItem(new SecurityRequirement()
                        .addList(SECURITY_SCHEME_NAME))

                // 🔐 Define JWT security scheme
                .components(new Components()
                        .addSecuritySchemes(
                                SECURITY_SCHEME_NAME,
                                new SecurityScheme()
                                        .name(SECURITY_SCHEME_NAME)
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                        )
                );
    }
}
