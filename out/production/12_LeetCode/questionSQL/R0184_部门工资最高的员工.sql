-- Write your MySQL query statement below


select d.name Department, e.name Employee, e.Salary Salary
from Employee e,
     Department d,
     (select DepartmentId, max(salary) salary from Employee group by DepartmentId) t
where e.DepartmentId = d.id
  and e.salary = t.salary
  and d.id = t.DepartmentId