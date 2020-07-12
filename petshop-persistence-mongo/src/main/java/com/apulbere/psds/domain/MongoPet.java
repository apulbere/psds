package com.apulbere.psds.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document("pet")
public class MongoPet implements Pet {

    private String id;
    private String name;
}
