-- Write your MySQL query statement below



select id-1 as id, student from seat where id %2=0
union
select id+1 as id, student from seat where id %2=1 and id+1 <= (select max(id) as id from seat)
union
select id ,student from seat where id%2=1 and id = (select max(id) as id from seat)

order by id

