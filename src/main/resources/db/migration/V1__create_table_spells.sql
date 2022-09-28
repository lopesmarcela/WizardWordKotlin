CREATE EXTENSION pgcrypto;
create extension "uuid-ossp";

CREATE TABLE spells (
    id uuid DEFAULT uuid_generate_v4 (),
    name varchar(50) not null,
    effect varchar(50) not null,
    can_be_verbal bool not null,
    type varchar(20) not null,
    light varchar(20) not null,
    creator varchar(50) not null,
    primary key (id)
);
