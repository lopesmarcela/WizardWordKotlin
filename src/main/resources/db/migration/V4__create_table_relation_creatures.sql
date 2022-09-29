CREATE TABLE related_creatures (
  creature_id uuid null,
  related_creatures_ids uuid null,
  foreign key (creature_id) references magical_creatures(id),
  foreign key (related_creatures_ids) references magical_creatures(id)
);