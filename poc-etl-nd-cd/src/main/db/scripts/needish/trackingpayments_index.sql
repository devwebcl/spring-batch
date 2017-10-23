-- to be executed in Prod Needish schema :

ALTER TABLE `rewards` ADD INDEX `payment_id` (`payment_id`);



-- Rollback:

ALTER TABLE `rewards` DROP INDEX `payment_id`;


