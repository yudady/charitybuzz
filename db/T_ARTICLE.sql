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

Date: 2013-01-21 19:19:21
*/


-- ----------------------------
-- Table structure for "SCOTT"."T_ARTICLE"
-- ----------------------------
DROP TABLE "SCOTT"."T_ARTICLE";
CREATE TABLE "SCOTT"."T_ARTICLE" (
"ID" NUMBER(10) NOT NULL ,
"LOTDETAILS" VARCHAR2(10 BYTE) NULL ,
"LEGALTERMS" VARCHAR2(10 BYTE) NULL ,
"SHIPPING" VARCHAR2(10 BYTE) NULL ,
"CURRENTBID" NUMBER(10) NULL ,
"STARTDATE" TIMESTAMP(6)  NULL ,
"ENDDATE" TIMESTAMP(6)  NULL ,
"USERID" NUMBER(10) NULL ,
"ESTIMATEDVALUE" NUMBER(10) NULL ,
"BIDLEVELID" NUMBER(10) NULL ,
"NEXTBID" NUMBER(10) NULL 
)
LOGGING
NOCOMPRESS
NOCACHE

;

-- ----------------------------
-- Records of T_ARTICLE
-- ----------------------------
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('2', 'lotDetails', 'legalTerms', 'shipping', '1', null, null, '1', '200', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('3', 'lotDetails', 'legalTerms', 'shipping', '1', null, null, '1', '300', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('4', 'lotDetails', 'legalTerms', 'shipping', '1', null, null, '1', '400', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('5', 'lotDetails', 'legalTerms', 'shipping', '1', null, null, '1', '500', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('6', 'lotDetails', 'legalTerms', 'shipping', '1', null, null, '1', '600', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('7', 'lotDetails', 'legalTerms', 'shipping', '2', null, null, '1', '100', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('8', 'lotDetails', 'legalTerms', 'shipping', '2', null, null, '1', '100', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('9', 'lotDetails', 'legalTerms', 'shipping', '3', null, null, '1', '200', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('10', 'lotDetails', 'legalTerms', 'shipping', '3', null, null, '1', '300', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('11', 'lotDetails', 'legalTerms', 'shipping', '3', null, null, '1', '400', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('12', 'lotDetails', 'legalTerms', 'shipping', '3', null, null, '1', '500', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('13', 'lotDetails', 'legalTerms', 'shipping', '3', null, null, '1', '600', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('14', 'lotDetails', 'legalTerms', 'shipping', '4', null, null, '1', '600', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('15', 'lotDetails', 'legalTerms', 'shipping', '4', null, null, '1', '600', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('16', 'lotDetails', 'legalTerms', 'shipping', '4', null, null, '1', '600', null, null);
INSERT INTO "SCOTT"."T_ARTICLE" VALUES ('1', 'lotDetails', 'legalTerms', 'shipping', '1', TO_TIMESTAMP('2013-01-21 16:56:40:079000', 'YYYY-MM-DD HH24:MI:SS:FF6'), TO_TIMESTAMP('2013-01-21 16:56:45:224000', 'YYYY-MM-DD HH24:MI:SS:FF6'), '1', '100', null, null);

-- ----------------------------
-- Indexes structure for table T_ARTICLE
-- ----------------------------

-- ----------------------------
-- Checks structure for table "SCOTT"."T_ARTICLE"
-- ----------------------------
ALTER TABLE "SCOTT"."T_ARTICLE" ADD CHECK ("ID" IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table "SCOTT"."T_ARTICLE"
-- ----------------------------
ALTER TABLE "SCOTT"."T_ARTICLE" ADD PRIMARY KEY ("ID");
