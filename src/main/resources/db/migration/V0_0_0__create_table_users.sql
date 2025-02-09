CREATE TABLE IF NOT EXISTS users
(
    id                 SERIAL PRIMARY KEY,
    first_name             VARCHAR(50)  NOT NULL,
    last_name                VARCHAR(60)  NOT NULL,
    adress             VARCHAR(250) NOT NULL,
    mail            VARCHAR(250) NOT NULL,
    password            VARCHAR(250) NOT NULL,
    state              VARCHAR(50)        NOT NULL DEFAULT 'ACTIVE',
    created_date       timestamp with time zone NOT NULL DEFAULT NOW(),
    last_modified_date timestamp with time zone NOT NULL DEFAULT NOW(),
    created_by         VARCHAR(40),
    last_modified_by   VARCHAR(40)
    );

