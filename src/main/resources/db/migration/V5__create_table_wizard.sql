CREATE TABLE wizards (
  id uuid DEFAULT uuid_generate_v4(),
  first_name varchar(50) not null,
  last_name varchar(50) not null,
  primary key(id)
);