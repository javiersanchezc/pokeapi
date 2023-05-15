DROP TABLE IF EXISTS request;

CREATE TABLE request (
                          id Long AUTO_INCREMENT  PRIMARY KEY,
                          ip_origin VARCHAR(10) NOT NULL,
                          time TIMESTAMP NOT NULL,
                          method VARCHAR(250) NOT NULL
);