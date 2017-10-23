CREATE TABLE tel_order (
  id INTEGER(11) NOT NULL AUTO_INCREMENT,
  code VARCHAR(5) NOT NULL,
  service_type varchar(32) NOT NULL,
  quantity INTEGER(11) NOT NULL,
  offer VARCHAR(32) NOT NULL,
  bill_type VARCHAR(32) NOT NULL,
  order_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
) ENGINE=InnoDB;