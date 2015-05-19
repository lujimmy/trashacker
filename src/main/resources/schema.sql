DROP DATABASE trashacker;

CREATE DATABASE IF NOT EXISTS trashacker
  DEFAULT CHARACTER SET = 'utf8'
  DEFAULT COLLATE = 'utf8_general_ci';

CREATE TABLE IF NOT EXISTS trashacker.garbage_go_location (
  `garbage_type_id` INTEGER COMMENT 'garbage_type.id',
  `garbage_id`      INTEGER COMMENT 'all garbage location table.id',
  `lat`             CHAR(128),
  `lng`             CHAR(128),
  PRIMARY KEY (garbage_type_id, garbage_id, lat, lng)
);

CREATE INDEX garbage_type_id_lat_lng ON trashacker.garbage_go_location (garbage_type_id, garbage_id, lat, lng);