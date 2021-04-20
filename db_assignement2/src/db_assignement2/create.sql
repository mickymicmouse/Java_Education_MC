create table bookTBL(
	isbn number(5) primary key,
	title varchar(50) not null,
	author varchar(50) not null,
	publisher varchar(50) not null,
	price number(6) not null,
	description varchar(200)
);

select * from bookTBL;