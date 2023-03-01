

select * from employees; 

select * from emplyees where firstName = "Leslie"; 


select * from employees where VacationHours < 40; 

select lastName, firstName from employees where firstName like "M%";

select e.firstName, e.lastName, c.customerName, c.phone, c. state
from employees e, customer c
where e.employeeNumber = c.salesRepEmployeeNumber 
order by e.fistName, e.lastName; 

update employees set extension = "NEW" where employeeNumber = 1002; 
update employees set extension = "JJJJ" where firstName like "J%"; 

insert into employees ( employeeNumber, lastName, firstName, extension, email, officeCode, reportsTo, jobTitle, VacationHours)
			values	  ( 2023, "Maloney", "Casey", "EXT", "e@mail.com" , "1", 1002, "TITLE", 500); 
            
delete from employees where employeeNumber = 2023; 


/*Friday - MySQL day 2
	
	Lab 304.2.1 ORDER BY CLAUSE 
 */ 
 
 /* USING ORDER DETAILS- 
	selects the order line items from the orderdetails table. 
    calculates the subtotal fro each line item and sorts the results based on the subtotal
 */
 
 
SELECT    orderNumber, orderlinenumber, 
quantityOrdered * priceEach
FROM    orderdetails
ORDER BY   quantityOrdered * priceEach DESC;


/* USING ORDER DETAILS- 
	make it more readdable use ALIAS to a column in the select statement and use that 
    column alias in the ORDERED BY clause
 */
 
 
 SELECT 
    orderNumber,
    orderLineNumber,
    quantityOrdered * priceEach AS subtotal
FROM    orderdetails
ORDER BY subtotal DESC;


/* EXAMPLE 2: MYSQL ORDERED BY AND NULL VALUES - 
	In SQL, NULL comes before non-NULL values. 
    Therefore, when you use the ORDER BY Clause with the ASC option, 
    NULLs appear first in the result set.
    
    For example, the following query uses the ORDER BY Clause to sort employees by values
    in the reportsTo column:

 */

SELECT     firstName, lastName, reportsTo
FROM    employees
ORDER BY reportsTo;

/* However, if you use the ORDER BY Clause with the DESC option, NULLs will appear last in the result set. 
For example:
 */
 
 SELECT    firstName, lastName, reportsTo
FROM    employees
ORDER BY reportsTo DESC;

select c.customerNumber, c.customerName, count(o.orderNumber)
from customers c, orders o 
where c.customerNumber = o.customerNumber
group by c.customerNumber 
order by customerName; 

-- i want to see the order number, product code, and the quantity that was ordered 
-- this does not need a group by 

-- the where clause can be written in any order 
-- price of the product and MSRP 
-- add the total price for each product 
-- see the margine for the line item 
-- margine total and customer total are called DERIVED DATA since they aren't in the table but be calc from the data in the table 
select c.contactFirstName, c.contactLastName,  p.productCode, p.productName, q.quantityOrdered, p.MSRP, p.buyPrice,
	(p.MSRP * q.quantityOrdered) AS customerTotal, 
    (p.MSRP - p.buyPrice) * q.quantityOrdered AS marginTotal
from orders o, products p, orderdetails q, customers c
where o.orderNumber = q.orderNumber
and c.customerNumber = o.customerNumber
and q.productCode = p.productCode; 


--  want to see the customer name, product code, and product name
-- how many times a customer has purchased a partiular product (not the quanityt of products purchased) 

select c.customerName, p.productCode, p.productName, count(p.productCode)
from customers c, orders o, products p, orderdetails od
where c.customerNumber = o.customerNumber
and od.productCode = p.productCode
and o.orderNumber= od.orderNumber
group by c.customerNumber, p.productCode
order by p.productCode; 


-- want to see all prodcuts names and how many times that product have been ordered (not quantity) 
-- order this by the product with the higest order ount and alphabetically 
select p.productCode, productName, count(p.productCode) as orderCount
from products p, orderdetails od
where od.productCode = p.productCode
group by p.productCode 
order by orderCount DESC, productName ASC; 

-- productLine and the dscription and he n uber f products in that product line 
select pl.productLine, pl.textDescription, count(p.productCode)
from productlines pl, products p
where pl.productLine = p.productLine
group by pl.productLine; 


-- case statment if the price each < 50 pring low, price < 100 pring medium price >= then high 

SELECT productName, buyPrice, 
CASE
	WHEN buyPrice >= 0 AND buyPrice <=  49 THEN "LOW"
	WHEN buyPrice >= 50 AND buyPrice <= 100 THEN "MEDIUM"
	WHEN buyPrice > 100 AND buyPrice <= 200 THEN "HIGH"
ELSE "Out of our range" END AS priceStatus 
FROM products ORDER BY buyPrice DESC;


select pay.amount, c.customerName, c.state
from customers c, payments pay
where pay.customerNumber = c.customerNumber
and pay.amount > 10.00
and c.state = 'MA'
order by pay.amount desc ; 



-- want to see the total profit for each item including the number of items purches 
-- if product x was ordered 10 times and has 50 items ordered in each order i want to see the total gross margin 

select p.MSRP, p.productCode, p.productName, od.quantityOrdered, p.buyPrice,
	(p.MSRP - p.buyPrice) * od.quantityOrdered AS marginTotal
from orders o, products p, orderdetails od
where o.orderNumber = od.orderNumber
and p.productCode = od.productCode; 

-- Homeowrk #1 of all the customer that have made orders, I want to see the customer name, first order date, month of the first order, 
-- 		the last order date,
-- 		year of the last order and how long this customer has been a customer ( last - first ) in days

select c.customerName, min(orderDate), month(min(o.orderDate)) as firstOrderMonth, month(max(o.orderDate)) as lastOrderMonth, year(max(o.orderDate)) as lastOrderYear,
		datediff( now(), min(o.orderDate)) 
 from customers c, orders o
 where c.customerNumber = o.customerNumber
 group by c.customerNumber  
 order by o.customerNumber; 


-- Homework #2 I want know the average margin for all orders sorted by the order with the highest margin first.  
-- 		This includes the margin on the quantity of products sold

-- AVG MARGIN 

select o.orderNumber, avg(MSRP - buyPrice) as avgMargin
from orders o, orderdetails od, products p
where o.orderNumber = od.orderNumber
and od.productCode = p.productCode 
group by o.orderNumber
order by avgMargin desc; 


-- Homework #3 - EXTRA HARD - I want to see my most profitable custoemrs by the avergae profit margin of all their orders

select c.customerNumber, c.customerName,  avg((MSRP - buyPrice) * quantityOrdered) as avgMargin
from orders o, orderdetails od, products p, customers c 
where o.orderNumber = od.orderNumber
and od.productCode = p.productCode 
and o.customerNumber = c.customerNumber
group by c.customerNumber
order by  avgMargin desc; 

-- Homework - having 1
-- I want to see all order that have more than 2 line items in that order.  Show me the order number and the count of line items and order by the highest line items first
-- hint : first write a query that will give you the count of all line items then add a having to limit
-- Homework - subquery 1
-- I want to see the most expensive order based on msrp and item quantity


-- homework 3
-- I want to see the all customers that are in states in which we have an office
-- change this query to use a regular join

select * from offices; 

select state from offices where state is not null; 

selecT * from customers where state in (select state from offices where state is not null);

-- same using a subquery 

select * 
	from customers c, 
   (select o.state from offices o where state is not null) os 
where c.state = os.state;  






