create table t_user (
  id number(10) not null primary key,
  firstname varchar2(10),
  lastname varchar2(10),
  screenname varchar2(10),
  password varchar2(10),
  email varchar2(10),
  promocode varchar2(10)
);

create table t_category (
  id number(10) not null primary key,
  name varchar2(10)
)
;
create table t_catalogitem (
  id number(10) not null primary key,
  categoryid varchar2(10),
  name varchar2(10),
  descript varchar2(10)
);

create table t_article (
  id number(10) not null primary key,
  lotdetails varchar2(10),
  legalterms varchar2(10),
  shipping varchar2(10),
  currentbid number(10),
  startdate TIMESTAMP,
  enddate TIMESTAMP,
  userid number(10),
  estimatedvalue number(10),
  bidlevelid number(10),
  nextbid number(10)
);
create table t_articlehistory (
  id number(10) not null primary key,
  userid number(10),
  amount number(10),
  bidtime date
);
create table catalogitemarticle (
  id number(10) not null primary key,
  articleid number(10),
  catalogitemid number(10)
);
commit;