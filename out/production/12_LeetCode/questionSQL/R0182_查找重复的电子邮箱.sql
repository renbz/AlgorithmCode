-- Write your MySQL query statement below

-- select distinct p1.Email from Person p1,Person p2 where p1.Email like p2.Email and p1.id != p2.id


select Email
from Person
group by Email
having count(id) > 1