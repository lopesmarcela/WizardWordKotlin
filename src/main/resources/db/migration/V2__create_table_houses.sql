CREATE TABLE houses (
  id uuid DEFAULT uuid_generate_v4(),
  name varchar(50) not null,
  house_colours varchar(50) not null,
  founder varchar(50) not null,
  animal varchar(50) not null,
  element varchar(50) not null,
  ghost varchar(50) not null,
  common_room varchar(50) not null,
  primary key(id)
);

create table traits(
    id uuid DEFAULT uuid_generate_v4(),
    name varchar(50) not null,
    house_id uuid not null,
    primary key(id),
    foreign key (house_id) references houses(id)
);

create table house_heads(
    id uuid DEFAULT uuid_generate_v4(),
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    house_id uuid not null,
    primary key(id),
    foreign key (house_id) references houses(id)
);
