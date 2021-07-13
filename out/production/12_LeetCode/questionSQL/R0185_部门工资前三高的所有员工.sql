-- Write your MySQL query statement below


select Department, Employee, Salary
from (select d.name       Department,
             e.name       Employee,
             e.salary     Salary,
             dense_rank() over(partition by d.Name order by salary desc) as rank_
      from Employee e,
           Department d
      where e.DepartmentId = d.id) t

where t.rank_ <= 3;



