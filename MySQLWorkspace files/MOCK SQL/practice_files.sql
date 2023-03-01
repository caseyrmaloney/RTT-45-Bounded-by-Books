/*
SQL MOCK SBA 
*/

use SBA_MOCKUP;
-- Create a query to return all orders made by users with the first name of “Marion” 

select o.ORDER_ID, u.user_ID, o.store_id 
from orders o, users u 
where o.user_id = u.user_id
and u.first_name = "Marion";  

-- Create a query to select all users that have not made an order 
-- weird because i dont see anything that is null for not having an order ? 
select * 
from users u, orders o, order_items oi
where u.first_name = "Mike" ; 

-- Create a Query to select the names and prices of all items that have been part of 2 or
-- more separate orders.

select * 
from order_items o, items i 
where o.item_ID = i.item_id; 

-- Create a query to return the Order Id, Item name, Item Price, and Quantity from orders
-- made at stores in the city “New York”. Order by Order Id in ascending order.

select o.order_id, i.name, i.price, oi.quantity
from order_items oi, stores s, orders o, items i
where 
	s.store_id = o.store_id
	and o.order_id = oi.order_id
	and i.item_id = oi.item_id
and s.city = 'New York'
order by o.order_id; 


--  Your boss would like you to create a query that calculates the total revenue generated
-- by each item. Revenue for an item can be found as (Item Price * Total Quantity
-- Ordered). Please return the first column as ‘ITEM_NAME’ and the second column as
-- ‘REVENUE’.


-- prints out fries twice? but nothing else confused 
select i.name, oi.quantity, i.price, 
	sum(oi.quantity * i.price) as total_price 
from items i, order_items oi 
where i.item_id = oi.item_id
group by i.name, i.price, oi.quantity ; 

