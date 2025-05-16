# Write your MySQL query statement below
Select e.employee_id 
From Employees e
Where e.salary<30000
And 
(
    e.manager_id NOT IN(
        Select employee_id
        From Employees
    )
)
order by e.employee_id;