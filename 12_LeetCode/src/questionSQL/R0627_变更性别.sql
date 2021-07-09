-- Write your MySQL query statement below


Update salary
set sex = char (ASCII(sex)^ASCII('m')^ASCII('f'))

