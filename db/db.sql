--oracle  '||'&'||'  =>    &



CREATE TABLE item (
id NUMBER(10) NOT NULL PRIMARY KEY,
lotNumber NUMBER(10) NOT NULL ,
categoryId NUMBER(10) NULL ,
title NVARCHAR2(2000) NULL ,
currentBid NUMBER(10) NULL ,
numberBids NUMBER(10) NULL ,
lotStart DATE NULL ,
lotClose DATE NULL ,
estimatedValue NUMBER(10) NULL ,
minNextBid NUMBER(10) NULL ,
mainPictureLocation NVARCHAR2(2000) NULL ,
status NUMBER(10) NULL 
)
;
COMMENT ON COLUMN item.id IS '商品id';
COMMENT ON COLUMN item.lotNumber IS 'Lot Number';
COMMENT ON COLUMN item.categoryId IS '第一級目錄id';
COMMENT ON COLUMN item.title IS '商品訊息';
COMMENT ON COLUMN item.currentBid IS '當前標價';
COMMENT ON COLUMN item.numberBids IS 'Bid次數';
COMMENT ON COLUMN item.lotStart IS '商品 開始日期';
COMMENT ON COLUMN item.lotClose IS '商品結束日期';
COMMENT ON COLUMN item.estimatedValue IS '估計價值';
COMMENT ON COLUMN item.minNextBid IS '下次最小標價';
COMMENT ON COLUMN item.mainPictureLocation IS '主要圖片路徑';
COMMENT ON COLUMN item.status IS '商品狀態';

INSERT INTO item VALUES (1,1,1,'商品訊息',100,1,NULL,NULL,1000,150,'src',1);
INSERT INTO item VALUES (2,2,1,'商品訊息',200,1,NULL,NULL,2000,250,'src',1);
INSERT INTO item VALUES (3,3,2,'商品訊息',300,1,null,null,2000,350,'src',1);



CREATE TABLE itemDetail (
id NUMBER(10) NOT NULL PRIMARY KEY,
itemId NUMBER(10) NULL ,
lotDetails NVARCHAR2(2000) NULL ,
legalTerms NVARCHAR2(2000) NULL ,
shipping NVARCHAR2(2000) NULL ,
winningBidderId NUMBER(10) NULL ,
biddingRuleId NUMBER(10) NULL 
)
;
COMMENT ON COLUMN itemDetail.id IS '商品詳細記錄id';
COMMENT ON COLUMN itemDetail.itemId IS '商品Id';
COMMENT ON COLUMN itemDetail.lotDetails IS 'LOTDETAILS訊息';
COMMENT ON COLUMN itemDetail.legalTerms IS 'LEGALTERMS訊息';
COMMENT ON COLUMN itemDetail.shipping IS 'SHIPPING訊息';
COMMENT ON COLUMN itemDetail.winningBidderId IS '當前贏家id Bidder_ID';
COMMENT ON COLUMN itemDetail.biddingRuleId IS 'Bidding_Rule_ID 使用哪個id來當規則';

INSERT INTO itemDetail VALUES (1,1, 'LOTDETAILS訊息', 'LEGALTERMS訊息', 'SHIPPING訊息',1,1);
INSERT INTO itemDetail VALUES (2,2, 'LOTDETAILS訊息', 'LEGALTERMS訊息', 'SHIPPING訊息',1,1);
INSERT INTO itemDetail VALUES (3,3, 'LOTDETAILS訊息', 'LEGALTERMS訊息', 'SHIPPING訊息',1,1);








CREATE TABLE bidlog (
id NUMBER(10) PRIMARY KEY NOT NULL,
bidderId NUMBER(10) NULL ,
amount NUMBER(10) NULL ,
bidtime DATE NULL 
)
;
COMMENT ON COLUMN bidlog.id IS 'bid歷史紀錄id';
COMMENT ON COLUMN bidlog.BidderId IS 'bid Bidder';
COMMENT ON COLUMN bidlog.amount IS '價格';
COMMENT ON COLUMN bidlog.bidtime IS '時間';





CREATE TABLE category (
id NUMBER(10) NOT NULL PRIMARY KEY,
name NVARCHAR2(2000) NULL 
)
;
COMMENT ON COLUMN category.id IS '第一級目錄id';
COMMENT ON COLUMN category.name IS '第一級目錄名稱';





INSERT INTO category VALUES ('1', 'Celebrity');
INSERT INTO category VALUES ('2', 'Entertainm');
INSERT INTO category VALUES ('3', 'Music');
INSERT INTO category VALUES ('4', 'Travel');
INSERT INTO category VALUES ('5', 'Sports');
INSERT INTO category VALUES ('6', 'Fashion');
INSERT INTO category VALUES ('7', 'Business Experiences');
INSERT INTO category VALUES ('8', 'Art '||'&'||' Collectibles');
INSERT INTO category VALUES ('9', 'Food');
INSERT INTO category VALUES ('10', 'Wellness '||'&'||' Beauty');




CREATE TABLE subcategory (
id NUMBER(10) PRIMARY KEY NOT NULL,
categoryId NUMBER(10) NULL ,
name NVARCHAR2(2000) NULL ,
descript NVARCHAR2(2000) NULL 
)
;
COMMENT ON COLUMN subcategory.id IS '第二級目錄id';
COMMENT ON COLUMN subcategory.categoryId IS '第一級目錄id';
COMMENT ON COLUMN subcategory.name IS '第二級目錄名稱';
COMMENT ON COLUMN subcategory.descript IS '第二級目錄描述';


INSERT INTO subcategory VALUES ('1', '1', 'Meet '||'&'||' Gre', null);
INSERT INTO subcategory VALUES ('2', '1', 'One-on-One', null);
INSERT INTO subcategory VALUES ('3', '1', 'Set Visits', null);
INSERT INTO subcategory VALUES ('4', '1', 'Awards Shows '||'&'||' Events ', null);
INSERT INTO subcategory VALUES ('5', '1', 'Virtual Experiences ', null);
INSERT INTO subcategory VALUES ('7', '2', 'Set Visits', null);
INSERT INTO subcategory VALUES ('8', '2', 'Walk-Ons '||'&'||' Auditions', null);
INSERT INTO subcategory VALUES ('9', '2', 'In the Audience', null);
INSERT INTO subcategory VALUES ('10', '2', 'Premieres '||'&'||' Screenings', null);
INSERT INTO subcategory VALUES ('11', '2', 'Broadway '||'&'||' Theatre', null);
INSERT INTO subcategory VALUES ('12', '2', 'Awards Shows '||'&'||' Events', null);
INSERT INTO subcategory VALUES ('13', '2', 'Children '||'&'||' Teens', null);
INSERT INTO subcategory VALUES ('14', '2', 'Memorabilia', null);
INSERT INTO subcategory VALUES ('16', '3', 'Concerts '||'&'||' Events', null);
INSERT INTO subcategory VALUES ('17', '3', 'Meet the Artist', null);
INSERT INTO subcategory VALUES ('18', '3', 'Guitars '||'&'||' Instruments', null);
INSERT INTO subcategory VALUES ('19', '3', 'Memorabilia', null);



CREATE TABLE subcategory_item (
id NUMBER(10) NOT NULL PRIMARY KEY,
itemId NUMBER(10) NOT NULL ,
subCatalogitemId NUMBER(10) NOT NULL 
)
;
COMMENT ON COLUMN subcategory_item.id IS '中間表id';
COMMENT ON COLUMN subcategory_item.itemId IS '商品id';
COMMENT ON COLUMN subcategory_item.catalogitemId IS '第二級目錄id';


INSERT INTO subcategory_item VALUES ('1', '1', '1');
INSERT INTO subcategory_item VALUES ('2', '2', '2');
INSERT INTO subcategory_item VALUES ('3', '3', '1');
INSERT INTO subcategory_item VALUES ('4', '4', '1');
INSERT INTO subcategory_item VALUES ('5', '5', '1');
INSERT INTO subcategory_item VALUES ('6', '6', '1');
INSERT INTO subcategory_item VALUES ('7', '7', '1');
INSERT INTO subcategory_item VALUES ('8', '8', '1');
INSERT INTO subcategory_item VALUES ('9', '9', '1');
INSERT INTO subcategory_item VALUES ('10', '10', '1');





CREATE TABLE picture (
id NUMBER NOT NULL PRIMARY KEY,
itemId NUMBER NULL ,
mark NVARCHAR2(20) NULL ,
location NVARCHAR2(200) NULL 
)
;
COMMENT ON COLUMN picture.id IS '圖片id';
COMMENT ON COLUMN picture.itemId IS '商品id';
COMMENT ON COLUMN picture.mark IS '圖片順序';
COMMENT ON COLUMN picture.location IS '圖片路徑';



INSERT INTO picture VALUES ('1', '1', '1', 'https://s3.amazonaws.com/images.charitybuzz.com/images/85732/detail.jpeg?1358201435');
INSERT INTO picture VALUES ('2', '3', '1', 'https://s3.amazonaws.com/images.charitybuzz.com/images/85765/thumb.JPG?1358266420');
INSERT INTO picture VALUES ('3', '3', '1', 'https://s3.amazonaws.com/images.charitybuzz.com/images/85766/thumb.png?1358266521');
INSERT INTO picture VALUES ('4', '3', '1', 'https://s3.amazonaws.com/images.charitybuzz.com/images/85767/thumb.jpg?1358266569');
INSERT INTO picture VALUES ('5', '3', '1', 'https://s3.amazonaws.com/images.charitybuzz.com/images/85768/thumb.JPG?1358266626');
INSERT INTO picture VALUES ('6', '2', '1', 'https://s3.amazonaws.com/images.charitybuzz.com/images/85937/detail.jpg?1358456488');





CREATE TABLE auctionRule (
id NUMBER(10) NOT NULL PRIMARY KEY,
ruleNumber NUMBER(10) NULL 
)
;
COMMENT ON COLUMN auctionRule.id IS '規則id';


INSERT INTO auctionRule VALUES ('1', 1);
INSERT INTO auctionRule VALUES ('2', 2);



CREATE TABLE auctionRuleDetail (
id NUMBER(10) NOT NULL PRIMARY KEY,
auctionRuleId NUMBER(10) NULL 
)
;
COMMENT ON COLUMN auctionRuleDetail.id IS '規則明細id';
COMMENT ON COLUMN auctionRuleDetail.auctionRuleId IS '規則id';
INSERT INTO auctionRuleDetail VALUES ('1', 1);
INSERT INTO auctionRuleDetail VALUES ('2', 2);


CREATE TABLE bidder (
id NUMBER(10) NOT NULL PRIMARY KEY,
firstName NVARCHAR2(20) NULL ,
lastName NVARCHAR2(20) NULL ,
screenName NVARCHAR2(20) NULL ,
passWord NVARCHAR2(20) NULL ,
email NVARCHAR2(20) NULL ,
promoCode NVARCHAR2(20) NULL 
)
;
COMMENT ON COLUMN bidder.id IS '投標者id';
COMMENT ON COLUMN bidder.firstName IS 'firstName';
COMMENT ON COLUMN bidder.lastName IS 'lastName';
COMMENT ON COLUMN bidder.screenName IS 'screenName';
COMMENT ON COLUMN bidder.passWord IS 'passWord';
COMMENT ON COLUMN bidder.email IS 'email';
COMMENT ON COLUMN bidder.promoCode IS 'promoCode';



INSERT INTO bidder VALUES ('1', 'lin', 'tommy', 'yudady', '123456', 'yu_dady@yahoo.com.tw', '123456');
INSERT INTO bidder VALUES ('2', 'lin', 'kevin', 'kevin', '123456', 'kevin@yahoo.com.tw', '123456');


CREATE TABLE operator (
id NUMBER(10) NOT NULL PRIMARY KEY,
name NVARCHAR2(20) ,
passWord NVARCHAR2(20) 
)
;
COMMENT ON COLUMN operator.id IS '後台管理者帳號id';
INSERT INTO operator VALUES ('1','111','111');


commit;