package com.apulbere.psds.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoPetConfig {

    @Bean
    public PetRepository petRepository(MongoPetRepository mongoPetRepository) {
        return new MongoPetRepositoryAdapter(mongoPetRepository);
    }
}
