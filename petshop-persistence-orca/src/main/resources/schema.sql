CREATE TABLE pet(
    id VARCHAR2(36) CONSTRAINT pk_id_pet PRIMARY KEY,
    name VARCHAR2(50) CONSTRAINT nn_name_pet NOT NULL
)