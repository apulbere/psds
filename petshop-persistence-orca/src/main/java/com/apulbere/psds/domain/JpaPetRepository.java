package com.apulbere.psds.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaPetRepository extends JpaRepository<JpaPet, UUID> {
}
