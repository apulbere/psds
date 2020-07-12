package com.apulbere.psds.domain;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
@AllArgsConstructor
public class JpaPetRepositoryAdapter implements PetRepository {

    private final JpaPetRepository petRepository;

    @Override
    public List<JpaPet> findAll() {
        return petRepository.findAll();
    }

    @Override
    public Pet save(Pet pet) {
        JpaPet jpaPet = new JpaPet(pet.getId(), pet.getName());
        log.info("saving {}", jpaPet);
        return petRepository.save(jpaPet);
    }
}
