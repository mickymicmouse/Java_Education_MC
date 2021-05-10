create table t_member(
	id varchar2(10) primary key,
	pwd varchar2(10) not null,
	name varchar2(50) not null,
	email varchar2(50),
	joinDate date default sysdate
);

insert into t_member(id,pwd,name,email) values('hong','1212','홍길동','hong@gmail.com');
insert into t_member values('lee','1212','이순신','lee@test.com',sysdate);
insert into t_member values('kim','1212','김유신','kim@jweb.com',sysdate);

select * from t_member;

insert into t_member(id,pwd,name,email) values(?,?,?,?);

email데이터가 lee@test.com인 사람의 모든 데이터를 조회하는 sql문을 작성하시오
select * from T_MEMBER where email = 'lee@test.com'
4. 변경
id가 hong인 사람의 email을 hong@admin.com으로 변경하는 코드를 작성하시오
update t_member set email = 'hong@admin.com' where id = 'hong'

