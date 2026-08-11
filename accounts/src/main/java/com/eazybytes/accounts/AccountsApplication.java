package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl") //For auditing, we need to enable JPA auditing and provide a reference to the AuditorAware implementation
@EnableConfigurationProperties(AccountContactInfoDto.class) // Enable configuration properties for AccountContactInfoDto
@OpenAPIDefinition(info = @Info(title = "Accounts Microservice",
        version = "1.0",
        description = "Documentation Accounts Microservice v1.0",
        contact = @Contact(name = "Sujay Kumar",
                email = "kumarsujay1994@gmail.com",
                url = "https://www.eazybytes.com"),
        license = @License(name = "Apache 2.0",
                url = "https://www.apache.org/licenses/LICENSE-2.0")),
        externalDocs = @ExternalDocumentation(description = "Accounts Microservice Documentation",
                url = "https://www.eazybytes.com/swagger-ui.html"))
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
