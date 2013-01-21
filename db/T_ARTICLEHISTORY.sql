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

Date: 2013-01-21 19:19:07
*/


-- ----------------------------
-- Table structure for "SCOTT"."T_ARTICLEHISTORY"
-- ----------------------------
DROP TABLE "SCOTT"."T_ARTICLEHISTORY";
CREATE TABLE "SCOTT"."T_ARTICLEHISTORY" (
"ID" NUMBER(10) NOT NULL ,
"USERID" NUMBER(10) NULL ,
"AMOUNT" NUMBER(10) NULL ,
"BIDTIME" DATE NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of T_ARTICLEHISTORY
-- ----------------------------

-- ----------------------------
-- Indexes structure for table T_ARTICLEHISTORY
-- ----------------------------

-- ----------------------------
-- Checks structure for table "SCOTT"."T_ARTICLEHISTORY"
-- ----------------------------
ALTER TABLE "SCOTT"."T_ARTICLEHISTORY" ADD CHECK ("ID" IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table "SCOTT"."T_ARTICLEHISTORY"
-- ----------------------------
ALTER TABLE "SCOTT"."T_ARTICLEHISTORY" ADD PRIMARY KEY ("ID");
