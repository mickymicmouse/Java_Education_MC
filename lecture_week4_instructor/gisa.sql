--테이블 생성 
--기사시험에 나오는 데이터를 입력하는 테이블인데
--속성의 이름을 StudentDTO의 필드이름으로 만들어 보세요
--int형은 NUMBER 크기가 없는 것으로
--String형은 VARCHAR2 로 크기가 50인 것으로 만드세요
--stdNo는 p.k로 선정하고 모든 컬럼(속성은) not null임.
--table이름 gisaTBL 입니다.
--3시 15분까지 만들어 보세요
CREATE TABLE gisaTBL(
	stdNo NUMBER PRIMARY KEY,
	email VARCHAR2(5) not null,
	kor NUMBER not null,
	eng NUMBER not null,
	math NUMBER not null,
	sci NUMBER not null,
	hist NUMBER not null,
	total NUMBER not null,
	mgrCode VARCHAR2(50) not null,
	accPoint VARCHAR2(50) not null,
	localCode VARCHAR2(50) not null
);

SELECT COUNT(*) FROM gisaTBL;

delete from gisaTBL;