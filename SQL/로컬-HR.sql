CREATE TABLE USERTBL 
(   userID CHAR(8) NOT NULL PRIMARY KEY,
    userName NVARCHAR2(10) NOT NULL,
    birthYear NUMBER(4) NOT NULL,
    addr NCHAR(2) NOT NULL,
    mobile1 CHAR(3),
    mobile2 CHAR(8),
    height NUMBER(3),
    mDate DATE 
);

INSERT INTO USERTBL VALUES ('LSG', '�̽±�', '1987', '����','011','11111111','182','2008-8-8');
INSERT INTO USERTBL VALUES ('KBS', '�����', '1979', '�泲','011','222','173','2008-4-4');
INSERT INTO USERTBL VALUES ('LSG', '�̽±�', '1987', '����','011','11111111','182','2008-8-8');
INSERT INTO USERTBL VALUES ('LSG', '�̽±�', '1987', '����','011','11111111','182','2008-8-8');
INSERT INTO USERTBL VALUES ('LSG', '�̽±�', '1987', '����','011','11111111','182','2008-8-8');
INSERT INTO USERTBL VALUES ('LSG', '�̽±�', '1987', '����','011','11111111','182','2008-8-8');

SELECT userName FROM USERTBL;