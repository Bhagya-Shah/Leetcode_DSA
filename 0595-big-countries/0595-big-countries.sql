# Write your MySQL query statement below
SELECT name,population,area FROM World where population>=25000000 
UNION SELECT name,population,area FROM World where area>=3000000;