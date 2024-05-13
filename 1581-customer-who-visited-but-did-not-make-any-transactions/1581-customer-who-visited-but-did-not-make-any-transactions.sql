# Write your MySQL query statement below

Select customer_id ,count(visit_id) as  count_no_trans from Visits where visit_id Not in (select visit_id from Transactions) group by customer_id;