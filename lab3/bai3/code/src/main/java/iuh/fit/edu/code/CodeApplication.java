package iuh.fit.edu.code;

import iuh.fit.edu.code.domain.DomainService;
import iuh.fit.edu.code.technical.TechnicalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
public class CodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeApplication.class, args);
    }
    @Bean
    public CommandLineRunner compareStyles(TechnicalService techService, DomainService domainService) {
        return args -> {
            System.out.println("\n===== 1. PACKAGE TECHNICAL =====");
            techService.register("tech@mail.com", "secret123");
            techService.login("tech@mail.com", "secret123");

            System.out.println("\n===== 2. PACKAGE DOMAIN =====");
            domainService.register("domain@mail.com", "secret123");
            domainService.login("domain@mail.com", "secret123");
        };
    }

}
