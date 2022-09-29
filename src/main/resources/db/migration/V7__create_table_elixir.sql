CREATE TABLE elixirs (
  id uuid DEFAULT uuid_generate_v4(),
  name varchar(50) not null,
  effect varchar(50) not null,
  side_effects varchar(50) not null,
  characteristics varchar(50) not null,
  time varchar(50) not null,
  difficulty varchar(50) not null,
  manufacturer varchar(50) not null,
  primary key(id)
);