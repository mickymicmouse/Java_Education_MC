--���̺� ���� 
--�����迡 ������ �����͸� �Է��ϴ� ���̺��ε�
--�Ӽ��� �̸��� StudentDTO�� �ʵ��̸����� ����� ������
--int���� NUMBER ũ�Ⱑ ���� ������
--String���� VARCHAR2 �� ũ�Ⱑ 50�� ������ ���弼��
--stdNo�� p.k�� �����ϰ� ��� �÷�(�Ӽ���) not null��.
--table�̸� gisaTBL �Դϴ�.
--3�� 15�б��� ����� ������
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