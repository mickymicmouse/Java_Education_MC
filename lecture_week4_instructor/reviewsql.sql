-- employees�� ��� ���� ��ȸ�Ͻÿ�
select * from employees;
-- department_id ��ȸ�Ͻÿ�. ���� --> 80���� 
select department_id,commission_pct from employees
where department_id = 
(select department_id from departments
where department_name = 'Sales');
-- ������ �޴� ��� ������ ��ȸ�Ͻÿ�.
-- ������ ������ ��ȸ�Ͻÿ�.(commission point�� �ִ� ������ ��ȸ�Ͻÿ�)
select * from employees
where commission_pct is not null;

-- �μ��� ��� ������ ����Ͻÿ�
select department_id from departments
where department_name = 'Sales';

-- ��� ������ ������ ��ȸ�Ͻÿ�
select employee_id,salary,salary*12 as annual
from employees;







