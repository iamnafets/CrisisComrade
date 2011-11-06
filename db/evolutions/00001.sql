# Users schema

# --- !Ups

CREATE TABLE User (
  id BIGINT NOT NULL AUTO_INCREMENT,
  email VARCHAR(255) NOT NULL,
  password CHAR(32) NOT NULL,
  fullName VARCHAR(255) NOT NULL,
  isAdmin boolean NOT NULL,
  PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE User;
