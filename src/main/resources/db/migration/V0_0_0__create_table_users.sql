CREATE TABLE IF NOT EXISTS users
(
    id                 SERIAL PRIMARY KEY,
    first_name             VARCHAR(50)  NOT NULL,
    last_name                VARCHAR(60)  NOT NULL,
    adress             VARCHAR(250) NOT NULL,
    mail            VARCHAR(250) NOT NULL,
    password            VARCHAR(250) NOT NULL
    );

