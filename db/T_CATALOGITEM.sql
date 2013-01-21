/*
Navicat Oracle Data Transfer
Oracle Client Version : 10.2.0.5.0

Source Server         : Tommy
Source Server Version : 110200
Source Host           : localhost:1521
Source Schema         : SCOTT

Target Server Type    : ORACLE
Target Server Version : 110200
File Encoding         : 65001

Date: 2013-01-21 19:18:55
*/


-- ----------------------------
-- Table structure for "SCOTT"."T_CATALOGITEM"
-- ----------------------------
DROP TABLE "SCOTT"."T_CATALOGITEM";
CREATE TABLE "SCOTT"."T_CATALOGITEM" (
"ID" NUMBER(10) NOT NULL ,
"CATEGORYID" VARCHAR2(10 BYTE) NULL ,
"NAME" VARCHAR2(50 BYTE) NULL ,
"DESCRIPT" VARCHAR2(50 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of T_CATALOGITEM
-- ----------------------------
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('1', '1', 'Meet & Gre', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('2', '1', 'One-on-One', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('3', '1', 'Set Visits', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('4', '1', 'Awards Sho', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('5', '1', 'Virtual Ex', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('6', '1', 'Set Visits', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('16', '3', 'Concerts & Events', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('17', '3', 'Meet the Artist', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('18', '3', 'Guitars & Instruments', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('19', '4', 'North America', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('20', '4', 'Caribbean', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('21', '4', 'Mexico & Central America', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('22', '4', 'South America', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('7', '2', 'Set Visits', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('8', '2', 'Walk-Ons null', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('9', '2', 'In the Audience', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('10', '2', 'Premieres null', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('11', '2', 'Broadway null', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('12', '2', 'Awards Shows null', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('13', '2', 'Children null', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('14', '2', 'Memorabilia', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('23', '4', 'Europe & UK', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('24', '4', 'Africa', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('25', '4', 'Asia & the Mid East', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('26', '4', 'Australia, Pacific', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('27', '4', 'Private Residence', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('28', '4', 'Tickets & Events', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('29', '4', 'Exclusive Access', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('30', '4', 'Football', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('31', '4', 'Baseball', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('32', '4', 'Basketball', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('33', '4', 'Golf', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('34', '4', 'Tennis', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('35', '4', 'Memorabilia', null);
INSERT INTO "SCOTT"."T_CATALOGITEM" VALUES ('36', '4', 'Other Sports', null);

-- ----------------------------
-- Indexes structure for table T_CATALOGITEM
-- ----------------------------

-- ----------------------------
-- Checks structure for table "SCOTT"."T_CATALOGITEM"
-- ----------------------------
ALTER TABLE "SCOTT"."T_CATALOGITEM" ADD CHECK ("ID" IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table "SCOTT"."T_CATALOGITEM"
-- ----------------------------
ALTER TABLE "SCOTT"."T_CATALOGITEM" ADD PRIMARY KEY ("ID");
