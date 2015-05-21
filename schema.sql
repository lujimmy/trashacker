-- 臺北市垃圾清運路線圖
CREATE TABLE `trashacker`.`garbage_truck_roadmap` (
  `id` INT UNSIGNED NOT NULL COMMENT '_id',
  `truck_id` CHAR(10) NULL COMMENT 'CarNo',
  `truck_number` CHAR(5) NULL COMMENT 'CarNumber',
  `department` CHAR(15) NULL COMMENT 'depName',
  `village` CHAR(5) NULL COMMENT 'Li',
  `region` CHAR(5) NULL COMMENT 'Region',
  `longitude` DECIMAL(16,13) NULL COMMENT 'Lng',
  `latitude` DECIMAL(16,13) NULL COMMENT 'Lat',
  `address` VARCHAR(100) NULL COMMENT 'Address',
  `arrive_time` TIME NULL COMMENT 'Upper half of CarTime',
  `leave_time` TIME NULL COMMENT 'Lower half of CarTime',
  PRIMARY KEY (`id`));

ALTER TABLE `trashacker`.`garbage_truck_roadmap`
CHANGE COLUMN `longitude` `longitude` DECIMAL(16,13) NOT NULL ,
CHANGE COLUMN `latitude` `latitude` DECIMAL(16,13) NOT NULL ,
ADD INDEX `lng_lat` (`longitude` ASC, `latitude` ASC);


-- 臺北市垃圾資源回收、廚餘回收限時收受點
CREATE TABLE `trashacker`.`recycling_food_waste_depot` (
  `id` INT UNSIGNED NOT NULL COMMENT '_id',
  `region` CHAR(5) NULL COMMENT 'Region',
  `brach` CHAR(8) NULL COMMENT 'Branch',
  `phone` CHAR(10) NULL COMMENT 'Phone',
  `address` VARCHAR(100) NULL COMMENT 'Address',
  `memo` VARCHAR(100) NULL COMMENT 'Memo',
  `longitude` DECIMAL(16,13) NULL COMMENT 'Lng',
  `latitude` DECIMAL(16,13) NULL COMMENT 'Lat');

ALTER TABLE `trashacker`.`recycling_food_waste_depot`
CHANGE COLUMN `longitude` `longitude` DECIMAL(16,13) NOT NULL ,
CHANGE COLUMN `latitude` `latitude` DECIMAL(16,13) NOT NULL ,
ADD INDEX `lng_lat` (`longitude` ASC, `latitude` ASC);


-- 臺北市週三、週日廚餘專用限時收受點
CREATE TABLE `trashacker`.`wed_sun_fodd_waste_depot` (
  `id` INT UNSIGNED NOT NULL COMMENT '_id',
  `region` CHAR(5) NULL COMMENT 'Region',
  `branch` CHAR(5) NULL COMMENT 'Branch',
  `address` VARCHAR(100) NULL COMMENT 'Address',
  `memo` VARCHAR(100) NULL COMMENT 'Memo',
  `longitude` DECIMAL(16,13) NULL COMMENT 'Lng',
  `latitude` DECIMAL(16,13) NULL COMMENT 'Lat',
  PRIMARY KEY (`id`));

ALTER TABLE `trashacker`.`wed_sun_fodd_waste_depot`
CHANGE COLUMN `longitude` `longitude` DECIMAL(16,13) NOT NULL ,
CHANGE COLUMN `latitude` `latitude` DECIMAL(16,13) NOT NULL ,
ADD INDEX `lng_lat` (`longitude` ASC, `latitude` ASC);


-- 臺北市居家廢棄藥物檢收站
CREATE TABLE `trashacker`.`medication_disposal_site` (
  `id` INT UNSIGNED NOT NULL COMMENT '_id',
  `name` VARCHAR(45) NULL COMMENT 'name',
  `address` VARCHAR(100) NULL COMMENT 'address_for_display',
  `phone` VARCHAR(45) NULL COMMENT 'telephone',
  `phone_extension` VARCHAR(10) NULL COMMENT 'may contains in telephone',
  `longitude` DECIMAL(16,13) NULL,
  `latitude` DECIMAL(16,13) NULL,
  PRIMARY KEY (`id`));

ALTER TABLE `trashacker`.`medication_disposal_site`
CHANGE COLUMN `longitude` `longitude` DECIMAL(16,13) NOT NULL ,
CHANGE COLUMN `latitude` `latitude` DECIMAL(16,13) NOT NULL ,
ADD INDEX `lng_lat` (`longitude` ASC, `latitude` ASC);


-- 臺北市核准身障福利團體設置舊衣回收箱
CREATE TABLE `trashacker`.`clothes_recycling_box` (
  `id` INT NOT NULL COMMENT '核准編號',
  `organization` VARCHAR(20) NULL COMMENT '團體名稱',
  `region` CHAR(5) NULL COMMENT '行政區',
  `address` VARCHAR(100) NULL COMMENT '核准地點',
  `longitude` DECIMAL(16,13) NULL,
  `latitude` DECIMAL(16,13) NULL,
  PRIMARY KEY (`id`));

ALTER TABLE `trashacker`.`clothes_recycling_box`
CHANGE COLUMN `longitude` `longitude` DECIMAL(16,13) NOT NULL ,
CHANGE COLUMN `latitude` `latitude` DECIMAL(16,13) NOT NULL ,
ADD INDEX `lng_lat` (`longitude` ASC, `latitude` ASC);


-- 臺北市資源回收分類方式
CREATE TABLE `trashacker`.`garbage_classification_instruction` (
  `id` INT UNSIGNED NOT NULL COMMENT '_id',
  `type` VARCHAR(20) NULL COMMENT '垃圾項目',
  `instruction` VARCHAR(200) NULL COMMENT '處理說明',
  `category` VARCHAR(10) NULL COMMENT '分類大類別',
  `sub_category` VARCHAR(10) NULL COMMENT '分類子類別',
  `keyword` VARCHAR(100) NULL COMMENT '關鍵字',
  `collectAtMon` BIT(1) NOT NULL,
  `collectAtTue` BIT(1) NOT NULL,
  `collectAtWed` BIT(1) NOT NULL,
  `collectAtThu` BIT(1) NOT NULL,
  `collectAtFri` BIT(1) NOT NULL,
  `collectAtSat` BIT(1) NOT NULL,
  `colectAtSun` BIT(1) NOT NULL);

ALTER TABLE `trashacker`.`garbage_classification_instruction`
ADD INDEX `keyword` (`keyword` ASC);
