package com.example.companycountryassignmentapp.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Primary
@AllArgsConstructor
@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {


    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("user");
    }

}

