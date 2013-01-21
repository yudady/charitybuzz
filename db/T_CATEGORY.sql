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

Date: 2013-01-21 19:18:29
*/


-- ----------------------------
-- Table structure for "SCOTT"."T_CATEGORY"
-- ----------------------------
DROP TABLE "SCOTT"."T_CATEGORY";
CREATE TABLE "SCOTT"."T_CATEGORY" (
"ID" NUMBER(10) NOT NULL ,
"NAME" VARCHAR2(30 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of T_CATEGORY
-- ----------------------------
INSERT INTO "SCOTT"."T_CATEGORY" VALUES ('2', 'Entertainm');
INSERT INTO "SCOTT"."T_CATEGORY" VALUES ('3', 'Music');
INSERT INTO "SCOTT"."T_CATEGORY" VALUES ('4', 'Travel');
INSERT INTO "SCOTT"."T_CATEGORY" VALUES ('5', 'Sports');
INSERT INTO "SCOTT"."T_CATEGORY" VALUES ('6', 'Fashion');
INSERT INTO "SCOTT"."T_CATEGORY" VALUES ('7', 'Business Experiences');
INSERT INTO "SCOTT"."T_CATEGORY" VALUES ('8', 'Art & Collectibles');
INSERT INTO "SCOTT"."T_CATEGORY" VALUES ('9', 'Food');
INSERT INTO "SCOTT"."T_CATEGORY" VALUES ('10', 'Wellness & Beauty');
INSERT INTO "SCOTT"."T_CATEGORY" VALUES ('1', 'Celebrity');

-- ----------------------------
-- Indexes structure for table T_CATEGORY
-- ----------------------------

-- ----------------------------
-- Checks structure for table "SCOTT"."T_CATEGORY"
-- ----------------------------
ALTER TABLE "SCOTT"."T_CATEGORY" ADD CHECK ("ID" IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table "SCOTT"."T_CATEGORY"
-- ----------------------------
ALTER TABLE "SCOTT"."T_CATEGORY" ADD PRIMARY KEY ("ID");
