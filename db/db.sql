--oracle  '||'&'||'  =>    &


CREATE TABLE t_article (
id NUMBER(10) NOT NULL PRIMARY KEY,
categoryId NUMBER(10) NULL ,
title NVARCHAR2(2000) NULL ,
lotDetails NVARCHAR2(2000) NULL ,
legalTerms NVARCHAR2(2000) NULL ,
shipping NVARCHAR2(2000) NULL ,
currentBid NUMBER(10) NULL ,
startDate DATE NULL ,
endDate DATE NULL ,
userId NUMBER(10) NULL ,
estimatedValue NUMBER(10) NULL ,
biddingRuleId NUMBER(10) NULL ,
minNextBid NUMBER(10) NULL 
)
;
COMMENT ON COLUMN t_article.id IS 'Lot Number';
COMMENT ON COLUMN t_article.categoryId IS '第一級目錄id';
COMMENT ON COLUMN t_article.title IS '商品訊息';
COMMENT ON COLUMN t_article.lotDetails IS 'LOTDETAILS訊息';
COMMENT ON COLUMN t_article.legalTerms IS 'LEGALTERMS訊息';
COMMENT ON COLUMN t_article.shipping IS 'SHIPPING訊息';
COMMENT ON COLUMN t_article.currentBid IS '當前標價';
COMMENT ON COLUMN t_article.startDate IS '商品 開始日期';
COMMENT ON COLUMN t_article.endDate IS '商品結束日期';
COMMENT ON COLUMN t_article.userId IS '當前贏家id';
COMMENT ON COLUMN t_article.estimatedValue IS '直購價';
COMMENT ON COLUMN t_article.biddingRuleId IS '使用哪個id來當規則';
COMMENT ON COLUMN t_article.minNextBid IS '下次最小標價';


INSERT INTO t_article VALUES ('1', '1', 'Sit In on The Howard Stern Show in NYC and Meet the Staff!', 'Howard fans rejoice, this is your unbelievable chance for you and a guest to see The Howard Stern Show and ', '    To be scheduled at a mutually convenient date.
', 'The minimum shipping, handling and applicable insurance for this item is $9.95. Additional shipping charges may apply based ', '5250', null, null, '1', '25000', '1', null);
INSERT INTO t_article VALUES ('2', '1', 'Play Tennis with John McEnroe at Sportime Randal', 'Enjoy a one hour lesson/hitting session with tennis legend John McEnroe!', 'Valid for one person and one ', 'The minimum shipping, handling and applicable insurance for this item is $9.95.', '4500', NULL, NULL, '1', '20000', '1', NULL);
INSERT INTO t_article VALUES ('3', '2', 'Attend the GRAMMY® Awards Show and MusiCares ', 'This is your last chance to bid on a very exclusive package! This amazing  ', 'Please read the following terms  ', 'sssssss','12500', null, null, '1', '30000', '1', null);





CREATE TABLE t_article_history (
id NUMBER(10) PRIMARY KEY NOT NULL,
userId NUMBER(10) NULL ,
amount NUMBER(10) NULL ,
bidtime DATE NULL 
)
;

CREATE TABLE t_category (
id NUMBER(10) NOT NULL PRIMARY KEY,
name NVARCHAR2(2000) NULL 
)
;

INSERT INTO t_category VALUES ('1', 'Celebrity');
INSERT INTO t_category VALUES ('2', 'Entertainm');
INSERT INTO t_category VALUES ('3', 'Music');
INSERT INTO t_category VALUES ('4', 'Travel');
INSERT INTO t_category VALUES ('5', 'Sports');
INSERT INTO t_category VALUES ('6', 'Fashion');
INSERT INTO t_category VALUES ('7', 'Business Experiences');
INSERT INTO t_category VALUES ('8', 'Art '||'&'||' Collectibles');
INSERT INTO t_category VALUES ('9', 'Food');
INSERT INTO t_category VALUES ('10', 'Wellness '||'&'||' Beauty');




CREATE TABLE t_catalog_item (
id NUMBER(10) PRIMARY KEY NOT NULL,
categoryId NUMBER(10) NULL ,
name NVARCHAR2(2000) NULL ,
descript NVARCHAR2(2000) NULL 
)
;
INSERT INTO t_catalog_item VALUES ('1', '1', 'Meet '||'&'||' Gre', null);
INSERT INTO t_catalog_item VALUES ('2', '1', 'One-on-One', null);
INSERT INTO t_catalog_item VALUES ('3', '1', 'Set Visits', null);
INSERT INTO t_catalog_item VALUES ('4', '1', 'Awards Shows '||'&'||' Events ', null);
INSERT INTO t_catalog_item VALUES ('5', '1', 'Virtual Experiences ', null);
INSERT INTO t_catalog_item VALUES ('7', '2', 'Set Visits', null);
INSERT INTO t_catalog_item VALUES ('8', '2', 'Walk-Ons '||'&'||' Auditions', null);
INSERT INTO t_catalog_item VALUES ('9', '2', 'In the Audience', null);
INSERT INTO t_catalog_item VALUES ('10', '2', 'Premieres '||'&'||' Screenings', null);
INSERT INTO t_catalog_item VALUES ('11', '2', 'Broadway '||'&'||' Theatre', null);
INSERT INTO t_catalog_item VALUES ('12', '2', 'Awards Shows '||'&'||' Events', null);
INSERT INTO t_catalog_item VALUES ('13', '2', 'Children '||'&'||' Teens', null);
INSERT INTO t_catalog_item VALUES ('14', '2', 'Memorabilia', null);
INSERT INTO t_catalog_item VALUES ('16', '3', 'Concerts '||'&'||' Events', null);
INSERT INTO t_catalog_item VALUES ('17', '3', 'Meet the Artist', null);
INSERT INTO t_catalog_item VALUES ('18', '3', 'Guitars '||'&'||' Instruments', null);
INSERT INTO t_catalog_item VALUES ('19', '3', 'Memorabilia', null);



CREATE TABLE t_catalog_item_article (
id NUMBER(10) NOT NULL PRIMARY KEY,
articleId NUMBER(10) NOT NULL ,
catalogitemId NUMBER(10) NOT NULL 
)
;
-- ----------------------------
INSERT INTO t_catalog_item_article VALUES ('1', '1', '1');
INSERT INTO t_catalog_item_article VALUES ('2', '2', '2');
INSERT INTO t_catalog_item_article VALUES ('3', '3', '1');
INSERT INTO t_catalog_item_article VALUES ('4', '4', '1');
INSERT INTO t_catalog_item_article VALUES ('5', '5', '1');
INSERT INTO t_catalog_item_article VALUES ('6', '6', '1');
INSERT INTO t_catalog_item_article VALUES ('7', '7', '1');
INSERT INTO t_catalog_item_article VALUES ('8', '8', '1');
INSERT INTO t_catalog_item_article VALUES ('9', '9', '1');
INSERT INTO t_catalog_item_article VALUES ('10', '10', '1');





CREATE TABLE t_picture (
id NUMBER NOT NULL PRIMARY KEY,
articleId NUMBER NULL ,
mark NVARCHAR2(20) NULL ,
location NVARCHAR2(200) NULL 
)
;

INSERT INTO t_picture VALUES ('1', '1', '1', 'https://s3.amazonaws.com/images.charitybuzz.com/images/85732/detail.jpeg?1358201435');
INSERT INTO t_picture VALUES ('2', '3', '1', 'https://s3.amazonaws.com/images.charitybuzz.com/images/85765/thumb.JPG?1358266420');
INSERT INTO t_picture VALUES ('3', '3', '1', 'https://s3.amazonaws.com/images.charitybuzz.com/images/85766/thumb.png?1358266521');
INSERT INTO t_picture VALUES ('4', '3', '1', 'https://s3.amazonaws.com/images.charitybuzz.com/images/85767/thumb.jpg?1358266569');
INSERT INTO t_picture VALUES ('5', '3', '1', 'https://s3.amazonaws.com/images.charitybuzz.com/images/85768/thumb.JPG?1358266626');
INSERT INTO t_picture VALUES ('6', '2', '1', 'https://s3.amazonaws.com/images.charitybuzz.com/images/85937/detail.jpg?1358456488');





CREATE TABLE t_user (
id NUMBER(10) NOT NULL PRIMARY KEY,
firstName NVARCHAR2(20) NULL ,
lastName NVARCHAR2(20) NULL ,
screenName NVARCHAR2(20) NULL ,
passWord NVARCHAR2(20) NULL ,
email NVARCHAR2(20) NULL ,
promoCode NVARCHAR2(20) NULL 
)
;
INSERT INTO t_user VALUES ('1', 'lin', 'tommy', 'yudady', '123456', 'yu_dady@yahoo.com.tw', '123456');
INSERT INTO t_user VALUES ('2', 'lin', 'kevin', 'kevin', '123456', 'kevin@yahoo.com.tw', '123456');

commit;