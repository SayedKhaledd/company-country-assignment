package com.example.companycountryassignmentapp.config;


import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@AllArgsConstructor
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class PersistenceConfig {

    @Bean
    public AuditAwareImpl auditorProvider() {
        return new AuditAwareImpl();
    }
}
