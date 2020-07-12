package com.apulbere.psds;

import com.apulbere.psds.domain.Pet;
import com.apulbere.psds.domain.PetRepository;
import lombok.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.UUID;

@Log4j2
@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private PetRepository petRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {
        List<Pet> pets = petRepository.findAll();
        log.info("{} fetched pets: {}", petRepository.getClass(), pets);

        Pet bolt = new PetDto(UUID.randomUUID().toString(), "Bolt");
        Pet savedBolt = petRepository.save(bolt);

        log.info("pet {} was saved", savedBolt);
    }

    @Value
    static class PetDto implements Pet {
        String id;
        String name;
    }
}
