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

Date: 2013-01-21 19:18:15
*/


-- ----------------------------
-- Table structure for "SCOTT"."T_USER"
-- ----------------------------
DROP TABLE "SCOTT"."T_USER";
CREATE TABLE "SCOTT"."T_USER" (
"ID" NUMBER(10) NOT NULL ,
"FIRSTNAME" VARCHAR2(10 BYTE) NULL ,
"LASTNAME" VARCHAR2(10 BYTE) NULL ,
"SCREENNAME" VARCHAR2(10 BYTE) NULL ,
"PASSWORD" VARCHAR2(10 BYTE) NULL ,
"EMAIL" VARCHAR2(30 BYTE) NULL ,
"PROMOCODE" VARCHAR2(100 BYTE) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of T_USER
-- ----------------------------
INSERT INTO "SCOTT"."T_USER" VALUES ('1', 'lin', 'tommy', 'yudady', '123456', 'yu_dady@yahoo.com.tw', '123456');
INSERT INTO "SCOTT"."T_USER" VALUES ('2', 'lin', 'kevin', 'kevin', '123456', 'kevin@yahoo.com.tw', '123456');

-- ----------------------------
-- Indexes structure for table T_USER
-- ----------------------------

-- ----------------------------
-- Checks structure for table "SCOTT"."T_USER"
-- ----------------------------
ALTER TABLE "SCOTT"."T_USER" ADD CHECK ("ID" IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table "SCOTT"."T_USER"
-- ----------------------------
ALTER TABLE "SCOTT"."T_USER" ADD PRIMARY KEY ("ID");
