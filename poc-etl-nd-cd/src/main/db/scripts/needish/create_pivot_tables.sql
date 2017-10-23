-- cities_pivot TABLE
CREATE TABLE `clandescuento`.`cities_pivot` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `n_city_id` INT NOT NULL,
  `n_location_id` INT NOT NULL,
  `n_latitude` FLOAT NOT NULL,
  `n_longitude` FLOAT NOT NULL,
  `n_slug` VARCHAR(150) NOT NULL,
  `n_name` VARCHAR(255) NOT NULL,
  `n_country_id` INT NOT NULL,
  `cd_appdomain_id` INT NOT NULL,
  `cd_city_id` INT NULL,
  `cd_city_uuid` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `unique_combination` (`n_city_id` ASC, `n_location_id` ASC));

-- ROLLBACK
DROP TABLE `clandescuento`.`cities_pivot`;

-- users_pivot TABLE
CREATE TABLE `clandescuento`.`users_pivot` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `n_user_id` INT NULL,
  `n_country_id` INT NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `uuid` VARCHAR(255) NOT NULL,
  `n_company_id` INT NULL,
  `cd_user_id` INT NULL,
  `cd_appdomain_id` INT NOT NULL,
  `city_pivot_id` INT NOT NULL,
  `is_user_created` SMALLINT(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `n_user_id_UNIQUE` (`n_user_id` ASC),
  UNIQUE INDEX `n_email_UNIQUE` (`email` ASC),
  UNIQUE INDEX `uuid_UNIQUE` (`uuid` ASC),
  UNIQUE INDEX `cd_user_id_UNIQUE` (`cd_user_id` ASC),
  CONSTRAINT `city_pivot_FK`
    FOREIGN KEY (`city_pivot_id`)
    REFERENCES `clandescuento`.`cities_pivot` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

-- ROLLBACK
DROP TABLE `clandescuento`.`users_pivot`;


-- city_deals_pivot TABLE
CREATE TABLE `clandescuento`.`city_deals_pivot` (
  `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `nd_deals_id` INT NOT NULL,         -- Needish Deal ID
  `cd_id` INT NOT NULL,               -- CityDealsWriter
  `cd_mulligan_enabled` tinyint(1) NOT NULL,
  `cd_mulligan_parent` INT NOT NULL,
  `cd_appdomain_id` INT NOT NULL,     -- AppDomains
  UNIQUE INDEX `nd_deals_id_UNIQUE` (`nd_deals_id` ASC));

-- ROLLBACK
DROP TABLE `clandescuento`.`city_deals_pivot`;


-- merchants_pivot TABLE
CREATE TABLE `clandescuento`.`merchants_pivot` (
  `n_company_id` INT NOT NULL,
  `n_company_name` VARCHAR(255),
  `cd_dm_merchant_id` INT NOT NULL
  UNIQUE INDEX `n_user_id_UNIQUE` (`n_company_id` ASC),
  UNIQUE INDEX `cd_user_id_UNIQUE` (`cd_dm_merchant_id` ASC));

-- ROLLBACK
DROP TABLE `clandescuento`.`merchants_pivot`;


-- deals_pivot TABLE
CREATE TABLE `clandescuento`.`deals_pivot` (
  `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `type` varchar(64) NOT NULL COMMENT 'Tipo: DEAL_TEMPLATE, DEAL_TEMPLATE_OPTION, DEAL_RUN, DEAL_RUN_OPTION, CITYDEALS',
  `nd_deals_id` INT NOT NULL,             -- Needish Deal ID
  `cd_gen_id` INT NOT NULL,               -- generic id
  UNIQUE INDEX `nd_deals_id_UNIQUE` (`nd_deals_id` ASC));

-- ROLLBACK
DROP TABLE `clandescuento`.`deals_pivot`;


