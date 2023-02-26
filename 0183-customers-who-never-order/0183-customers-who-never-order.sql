# Write your MySQL query statement below
SELECT Customers.name AS Customers from Customers where Customers.id NOT IN (Select Orders.customerId from Orders)