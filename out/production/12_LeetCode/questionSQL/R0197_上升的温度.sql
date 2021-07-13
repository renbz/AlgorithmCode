-- Write your MySQL query statement below


select w2.id
from weather w1,
     weather w2
where DATEDIFF(w2.RecordDate, w1.RecordDate) = 1
  and w1.Temperature < w2.Temperature

