/* Write your PL/SQL query statement below */
select Visits.customer_id, Count(Visits.visit_id) AS count_no_trans
from Visits left join Transactions
on Visits.visit_id = Transactions.visit_id
where transaction_id IS NULL
GROUP BY customer_id;