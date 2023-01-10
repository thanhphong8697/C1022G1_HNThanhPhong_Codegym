create database `co_so_du_lieu_quan_he`;
use `co_so_du_lieu_quan_he`;
create table `class`(
id int not null,
`name` varchar(50),
primary key(id));
insert into class (id, `name`) values (1, "phong");
select * from class;
update class 
set name = "c1022g1"
where id = 1;