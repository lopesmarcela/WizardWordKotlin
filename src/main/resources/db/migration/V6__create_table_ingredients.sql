CREATE TABLE ingredients (
  id uuid DEFAULT uuid_generate_v4(),
  name varchar(50) not null,
  primary key(id)
);