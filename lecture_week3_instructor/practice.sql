
CREATE TABLE testTBL2(
	id NUMBER(4) PRIMARY KEY,
	userName NCHAR(3) not null,
	age NUMBER(2),
	nation NCHAR(4) default '���ѹα�'
);

SELECT * FROM testTBL2 ORDER BY id DESC;
INSERT INTO testTBL2(id,userName) 
VALUES (10,20);
--employees�� ��� ������ ��ȸ�Ͻÿ�
SELECT LAST_NAME,FIRST_NAME
FROM EMPLOYEES;
--employees�� LAST_NAME, FIRST_NAME�� ����Ͻÿ� 
-- LAST_NAME�� ���� �;� �մϴ�.
SELECT userID,amount
FROM buyTBL
ORDER BY userID;

SELECT userID, SUM(amount)
FROM buyTBL
GROUP BY userID;

--INSERT INTO ���̺��(�Ӽ�����)
--VALUES (�Ӽ��� ������ ���� ��)

