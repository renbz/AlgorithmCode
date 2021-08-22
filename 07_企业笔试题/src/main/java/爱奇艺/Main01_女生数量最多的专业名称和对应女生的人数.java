package 爱奇艺;

/**
 * @author Ren
 */

public class Main01_女生数量最多的专业名称和对应女生的人数 {

    /*
        -- 先查出 专业id和女生数量
        select m.name as subject_name, t2 as girl_count
        from Subject_Info m,
             (
                 select subject_id as t1, count(*) as t2
                 from Student_Info as s,
                      Subject_Register as r
                 where s.id = r.student_id
                   and gender = 2
                 group by subject_id
             ) as n
        where m.id = n.t1
        order by t2 desc
        limit 3
     */


    /**
     * 测试数据  表信息


     use mytest;
     create table Student_Info
     (
     id     int primary key not null,
     name   varchar(30),
     gender int
     );
     insert into Student_Info(id, name, gender)
     values (1, 'Kate', 2);
     insert into Student_Info(id, name, gender)
     values (2, 'Mary', 2);
     insert into Student_Info(id, name, gender)
     values (3, 'Tom', 1);
     insert into Student_Info(id, name, gender)
     values (4, 'Jim', 1);
     insert into Student_Info(id, name, gender)
     values (5, 'Lily', 2);
     insert into Student_Info(id, name, gender)
     values (6, 'Rose', 2);
     insert into Student_Info(id, name, gender)
     values (7, 'Lucy', 2);
     insert into Student_Info(id, name, gender)
     values (8, 'Meimei', 2);

     create table Subject_Register
     (
     student_id int primary key not null,
     subject_id int
     );
     insert into Subject_Register(student_id, subject_id)
     values (1, 1);
     insert into Subject_Register(student_id, subject_id)
     values (2, 2);
     insert into Subject_Register(student_id, subject_id)
     values (3, 3);
     insert into Subject_Register(student_id, subject_id)
     values (4, 3);
     insert into Subject_Register(student_id, subject_id)
     values (5, 2);
     insert into Subject_Register(student_id, subject_id)
     values (6, 4);
     insert into Subject_Register(student_id, subject_id)
     values (7, 4);
     insert into Subject_Register(student_id, subject_id)
     values (8, 4);

     create table Subject_Info
     (
     id   int primary key not null,
     name varchar(30)
     );
     insert into Subject_Info(id, name)
     values (1, 'Math');
     insert into Subject_Info(id, name)
     values (2, 'English');
     insert into Subject_Info(id, name)
     values (3, 'Computer');
     insert into Subject_Info(id, name)
     values (4, 'News');

     */

}
