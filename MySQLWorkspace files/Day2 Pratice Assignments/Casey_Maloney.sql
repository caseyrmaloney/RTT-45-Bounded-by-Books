
/*Friday - MySQL day 2
	
	Lab 304.2.3 PRATICE ASSIGNMENT SIMPLE QUERIES 
    
1.  Write a query to display the name, product line, and buy price of all products.
		The output columns should display as “Name,” “Product Line,” and “Buy Price.”
		The output should display the most expensive items first.
 
2. Write a query to display the first name, last name, and city name of all customers 
		from Germany. Columns should display as “First Name,” “Last Name,” and “City.” 
        The output should be sorted by “Last Name” (ascending).

3. Write a query to display each of the unique values of the status field in the orders
		table. The output should be sorted alphabetically, increasing. Hint: The output 
        should show exactly six rows.

4. Select all fields from the payments table for payments made on or after January 1, 
		2005. The output should be sorted by the payment date from highest to lowest.

5. Write a query to display the Last Name, First Name, Email Address, and Job Title of
		all employees working out of the San Francisco office. Output should be sorted
        by “Last Name.”

6. Write a query to display the Name, Product Line, Scale, and Vendor of all of the Car 
		products – both classic and vintage. The output should display all vintage cars 
        first (sorted alphabetically by name), and all classic cars last (also sorted 
        alphabetically by name). 

 */
 
 
 /*PROBEM 1 */
 
 select productName, productLine, buyPrice from products
 order by buyPrice desc; 
 
  /*PROBEM 2 */ 
  
  select contactFirstName, contactLastName, city from customers
  where country = "Germany" 
  order by contactLastName asc; 
  
/*PROBEM 3 */ 
 select * from orders
 where status = "Cancelled"; 
 
 /*PROBEM 4 */ 
 select * from payments 
 where DATE(paymentDate) <= "2005-01-01" 
 order by paymentDate ASC; 
 
 /*PROBEM 5 */
 select e.lastName, e.firstName, e.email, e.jobTitle, o.city
 from employees e, offices o
 where o.city = "San Francisco"
 order by lastName asc; 
 
  /*PROBEM 6 */
  select * from products; 
  select productName, productLine, productScale, productVendor from products
  where productLine = "Classic Cars" or productLine="Vintage Cars"
  order by productName asc, productLine= "Vintage Cars" asc; 
 
