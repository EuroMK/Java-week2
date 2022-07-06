-- CUSTOMER TABLE 

-- Q1. All records from the customer table
SELECT * FROM Customers

-- Q2. All Customers from Paris
SELECT * FROM Customers
WHERE City = 'Paris'

-- Q3. All Distinct Cities (in France)
SELECT DISTINCT City FROM Customers
WHERE Country = 'France'

-- Q4. All Customers with a Sales Representative
SELECT * FROM Customers
WHERE ContactTitle = 'Sales Representative'

-- PRODUCTS TABLE

-- Q5. Get me the pavlova!
SELECT * FROM Products
WHERE ProductName = 'Pavlova'

-- Q6. Get all Products from Supplier 7
SELECT * FROM Products
WHERE SupplierID = '7'

-- Q7. Get all products with 0 Units in Stock
SELECT * FROM Products
WHERE UnitsInStock = '0'

-- Q8. Get all products with between 20 and 40 units in stock (that are not discontinued)
SELECT * FROM Products
WHERE UnitsInStock BETWEEN 20 AND 40
AND Discontinued = '0'

-- Q9. Get all products by 'Chef Anton' (you will need to use the LIKE keyword - see W3 Schools)
SELECT * FROM Products
WHERE ProductName LIKE 'Chef Anton%'

-- Q10. Get all products by Sold in Jars (you will need to use the LIKE keyword - see W3 Schools)
SELECT * FROM Products
WHERE QuantityPerUnit LIKE '%jars'

-- EMPLOYEES TABLE

-- Q11. Get all employees and have a look at the data
SELECT * FROM Employees

-- Q12. Without writing any SQL, tell me who the manager of Margaret Peacock is
-- Her manager is **Andrew Fuller**

-- Q13. Get all employees who were born before 1960 (< '1960-01-01')
SELECT * FROM Employees
WHERE BirthDate < '1960-01-01'

-- Q14. Insert yourself as an Employee!! 
-- (The database automatically assigns an EmployeeID, so don't try to insert a value for this column).
INSERT INTO Employees (LastName, FirstName, Title, TitleOfCourtesy, BirthDate, HireDate, Address, City, Region, PostalCode, Country, HomePhone, Extension, Photo, Notes, ReportsTo, PhotoPath)
VALUES ('Kavanagh','Matthew','Associate','Mr.','1950-04-03','2022-05-07','Derry','Derry','Ulster','BT47','IRL','12345','3423','NULL','NULL','2','NULL');

SELECT * FROM Customers
WHERE City != 'Paris' -- not equal to method 1

SELECT * FROM Customers
WHERE City <> 'Paris' -- not equal to method 2

SELECT * FROM Customers
WHERE Region != 'BC' -- 2 rows

SELECT * FROM Customers
WHERE Region != 'BC' -- 29 rows

SELECT * FROM Customers
WHERE Region IS NULL -- 60 rows

SELECT * FROM Customers
WHERE Region IS NOT NULL -- 31 rows

SELECT * FROM Orders -- 830 

SELECT * FROM Shippers -- 3

SELECT * FROM [Order Details]

-- ------ Table Joins ------

SELECT * FROM Categories -- 8

SELECT * FROM Products -- 77

SELECT * FROM Categories
INNER JOIN Products
ON Categories.CategoryID = Products.CategoryID -- 77 

SELECT * 
FROM Categories AS CAT
INNER JOIN Products AS PROD
ON CAT.CategoryID = PROD.ProductID
-- WHERE PROD.ProductName = 'Chai'

-- Q15. Join Customer and Orders Tables

SELECT * 
FROM Customers
INNER JOIN Orders
ON Customers.CustomerID = Orders.CustomerID

SELECT *
FROM Customers AS CUST
INNER JOIN Orders AS ORD
ON CUST.CustomerID = ORD.CustomerID -- 830 rows

-- Q16. Join the Order Details and Products Tables

SELECT *
FROM [Order Details] AS ORDE
INNER JOIN Products AS PROD
ON ORDE.ProductID = PROD.ProductID -- 2155 rows

-- Q17. Join the Products and Suppliers Tables

SELECT *
FROM Products AS PROD 
INNER JOIN Suppliers AS SUPP
ON PROD.SupplierID = SUPP.SupplierID -- 77 rows

-- Q18. Get CustomerName, Order Date and Destination City

SELECT ContactName, OrderDate, ShipCity
FROM Customers AS CUST
INNER JOIN Orders AS ORD
ON CUST.CustomerID = ORD.CustomerID -- 830 rows

-- Q19. Get Category Name, Description, Product Name and Unit Price where the unit price is more than 20

SELECT CategoryName, [Description], ProductName, UnitPrice 
FROM Categories AS CAT 
INNER JOIN Products AS PROD
ON CAT.CategoryID = PROD.CategoryID -- 77 rows

-- Q20. Get Orders shipped to Germany that were placed in 1998
-- Show the columns
-- CustomerID, CustomerName, Country, OrderID, OrderDate and ShipCountry

SELECT CUST.CustomerID, ContactName, Country, OrderID, ShipCountry, OrderDate
FROM Orders AS ORD
INNER JOIN Customers AS CUST
ON ORD.CustomerID = CUST.CustomerID
WHERE ORD.ShipCountry = 'Germany'
AND ORD.OrderDate >= '1998.01.01'
AND ORD.OrderDate < '1999.01.01' -- 34 rows

AND OrderDate LIKE '%1998%' -- 34 rows

-- -------

SELECT * 
FROM Customers
WHERE ContactTitle LIKE '%Representative' -- 18 rows

SELECT CUST.CompanyName
, ORD.OrderID
, EMP.FirstName + ' ' + EMP.LastName AS 'Full Name' -- step 3 830 rows
FROM Customers AS CUST 
INNER JOIN Orders AS ORD
ON CUST.CustomerID = ORD.CustomerID -- step 1 830 rows
INNER JOIN Employees AS EMP 
ON ORD.EmployeeID = EMP.EmployeeID -- step 2 830 rows

