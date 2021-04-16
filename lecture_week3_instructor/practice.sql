
CREATE TABLE testTBL2(
	id NUMBER(4) PRIMARY KEY,
	userName NCHAR(3) not null,
	age NUMBER(2),
	nation NCHAR(4) default '대한민국'
);

SELECT * FROM testTBL2 ORDER BY id DESC;
INSERT INTO testTBL2(id,userName) 
VALUES (10,20);
--employees의 모든 정보를 조회하시오
SELECT LAST_NAME,FIRST_NAME
FROM EMPLOYEES;
--employees의 LAST_NAME, FIRST_NAME을 출력하시오 
-- LAST_NAME이 먼저 와야 합니다.
SELECT userID,amount
FROM buyTBL
ORDER BY userID;

SELECT userID, SUM(amount)
FROM buyTBL
GROUP BY userID;

--INSERT INTO 테이블명(속성순서)
--VALUES (속성의 순서에 따른 값)

