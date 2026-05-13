package org.learne.platform.shared.infrastructure.documentation.openapi.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI neurixLearnPlatformOpenApi() {
        // General configuration
        var openApi = new OpenAPI();
        openApi
                .info(new Info()
                        .title("NeurixLearn Platform API")
                        .description("NeurixLearn Platform is a comprehensive educational platform that provides " +
                                "a complete REST API for managing courses, users, assessments, and learning materials. " +
                                "This API enables seamless integration with educational applications, supporting " +
                                "course enrollment, progress tracking, exam management, and personalized learning experiences.")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0")
                                .url("https://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("NeurixLearn Platform wiki Documentation")
                        .url("https://neurixlearn-platform.wiki.github.io/docs"));
        return openApi;
    }
}
