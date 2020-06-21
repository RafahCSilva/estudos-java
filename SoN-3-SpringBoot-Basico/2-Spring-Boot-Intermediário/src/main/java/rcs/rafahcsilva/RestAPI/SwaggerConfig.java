package rcs.rafahcsilva.RestAPI;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiConfigDocs() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("rcs.rafahcsilva.RestAPI.resources"))
                // .paths(PathSelectors.ant("/api/*"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo infoDocs() {
        return new ApiInfo(
                "Rest API",
                "My Description",
                "1.0",
                "Terms",
                new Contact("Rafael", "https://github.com/RafahCSilva/estudos-java", "rafahcsilva@gmail.com"),
                "Apache License",
                "Url",
                new ArrayList<VendorExtension>()
        );
    }
}
/*
 * http://localhost:8080/api/swagger-ui.html
 * http://localhost:8080/api/v2/api-docs
 */
