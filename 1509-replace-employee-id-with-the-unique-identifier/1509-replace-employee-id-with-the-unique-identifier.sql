/* Write your PL/SQL query statement below */
select uni.unique_id, e.name
from employees e left join employeeuni uni
on uni.id = e.id;