/* Write your PL/SQL query statement below */
select v.customer_id, COUNT(*)  as count_no_trans
from visits v left join transactions t
on v.visit_id = t.visit_id 
where transaction_id is null
group by customer_id;