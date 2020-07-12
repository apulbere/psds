package com.apulbere.psds.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaPetConfig {

    @Bean
    public PetRepository petRepository(JpaPetRepository jpaPetRepository) {
        return new JpaPetRepositoryAdapter(jpaPetRepository);
    }
}
