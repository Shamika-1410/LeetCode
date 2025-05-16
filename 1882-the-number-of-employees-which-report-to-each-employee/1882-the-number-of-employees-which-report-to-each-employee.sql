SELECT 
  mgr.employee_id, 
  mgr.name, 
  COUNT(emp.employee_id) AS reports_count, 
  ROUND(
    AVG(emp.age)
  ) AS average_age 
FROM 
  employees emp 
  JOIN employees mgr ON emp.reports_to = mgr.employee_id 
GROUP BY 
  employee_id 
ORDER BY 
  employee_id