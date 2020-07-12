package com.apulbere.psds.domain;

import java.util.List;

public interface PetRepository {

    <T extends Pet> List<T> findAll();

    Pet save(Pet pet);
}
