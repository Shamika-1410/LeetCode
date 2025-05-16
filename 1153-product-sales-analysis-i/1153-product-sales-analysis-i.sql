/* Write your PL/SQL query statement below */
select p.product_name, s.year, s.price
from Sales s Inner join Product p
on s.product_id = p.product_id;
