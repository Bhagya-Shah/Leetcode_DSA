# Write your MySQL query statement below
SELECT E.name,B.bonus from Employee E NATURAL LEFT JOIN Bonus B where bonus<1000 or bonus is null