/*
LAB 304.3.1 OPERATORS 

*/ 

/*
EXAMPLE 1: OR 
For example, to get the customers who are located in the USA or France, 
you can use the OR operator in the WHERE clause as follows:
*/ 

SELECT    customername, country
FROM    customers
WHERE    country = 'USA' OR country = 'France';

/*
EXAMPLE 2:AND
The AND operator is a logical operator that combines two or more Boolean expressions, and returns true 
only if both expressions evaluate as true. 
The AND operator returns false if one of the two expressions evaluates as false.
*/ 

SELECT    customername, country, creditLimit  
FROM    customers
WHERE (country = 'USA' OR country = 'France') AND creditlimit > 100000;

SELECT  customername, country, creditLimit FROM    customers
WHERE    country = 'USA' OR country = 'France' AND creditlimit > 100000;

/*
EXAMPLE 3: BETWEEN AND NOT BETWEEN 
The BETWEEN operator selects values within a given range. The values can be numbers, 
text, or dates.
The BETWEEN operator is inclusive: begin and end values are included. 
*/ 


SELECT     productCode,  productName,  buyPrice 
FROM    products
WHERE     buyPrice BETWEEN 90 AND 100;

SELECT productCode, productName, buyPrice 
FROM products
WHERE  buyPrice >= 90 AND buyPrice <= 100;

SELECT productCode, productName, buyPrice FROM products 
WHERE buyPrice NOT BETWEEN 20 AND 100;

SELECT productCode, productName, buyPrice FROM products
WHERE  buyPrice < 20     OR     buyPrice > 100; 

/*
EXAMPLE 4: IS NULL  
The following query uses the IS NULL operator to find customers who do not
 have a sales representative
*/ 

SELECT customerName, country, salesrepemployeenumber
FROM customers
WHERE salesrepemployeenumber IS NULL
ORDER BY  customerName;

SELECT customerName, country, salesrepemployeenumber
FROM  customers
WHERE  salesrepemployeenumber IS NOT NULL
ORDER BY customerName;

-- The following query uses the LEFT JOIN predicate and the IS NULL operator  to find customers who have no order:

SELECT  c.customerNumber, c.customerName,  orderNumber, o.STATUS
FROM customers c
LEFT JOIN orders o 
ON c.customerNumber = o.customerNumber
WHERE  orderNumber IS NULL;
