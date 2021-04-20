-- employees의 모든 행을 조회하시오
select * from employees;
-- department_id 조회하시오. 조건 --> 80번만 
select department_id,commission_pct from employees
where department_id = 
(select department_id from departments
where department_name = 'Sales');
-- 수당을 받는 모든 직원을 조회하시오.
-- 영업부 직원을 조회하시오.(commission point가 있는 직원을 조회하시오)
select * from employees
where commission_pct is not null;

-- 부서의 모든 정보를 출력하시오
select department_id from departments
where department_name = 'Sales';

-- 모든 직원의 연봉을 조회하시오
select employee_id,salary,salary*12 as annual
from employees;







