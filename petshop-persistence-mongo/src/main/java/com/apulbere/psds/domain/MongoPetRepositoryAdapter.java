package com.apulbere.psds.domain;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
@AllArgsConstructor
public class MongoPetRepositoryAdapter implements PetRepository {

    private final MongoPetRepository petRepository;

    @Override
    public List<MongoPet> findAll() {
        return petRepository.findAll();
    }

    @Override
    public Pet save(Pet pet) {
        MongoPet mongoPet = new MongoPet(pet.getId(), pet.getName());
        log.info("saving {}", mongoPet);
        return petRepository.save(mongoPet);
    }
}
