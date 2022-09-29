CREATE TABLE magical_creatures (
  id uuid DEFAULT uuid_generate_v4(),
  name varchar(50) not null,
  description varchar(50) not null,
  classification varchar(50) not null,
  status varchar(50) not null,
  danger_level varchar(50) not null,
  native_to varchar(50) not null,
  primary key(id)
);