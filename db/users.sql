create or replace table users (
  id Number(4) NOT NULL PRIMARY KEY,
  userName varchar2(10),
  password varchar2(10)
)
----------------------
drop sequence SEQ_users

create sequence SEQ_users
minvalue 1
maxvalue 99999999
start with 1
increment by 1
nocache
order;
----------------------

create or replace trigger users_trigger
  before insert on users   --users 是表名
  for each row
declare
  nextid number;
begin
  IF :new.id IS NULL or :new.id=0 THEN --DepartId是列名
    select SEQ_users.nextval --SEQ_ID正是剛才創建的
    into nextid
    from sys.dual;
    :new.id:=nextid;
  end if;
end users_trigger;


INSERT INTO users(userName,password) Values('Cao','123');

commit;