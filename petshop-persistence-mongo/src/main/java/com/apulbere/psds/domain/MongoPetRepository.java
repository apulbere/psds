package com.apulbere.psds.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface MongoPetRepository extends MongoRepository<MongoPet, UUID> {
}
