use `co_so_du_lieu_quan_he`;
create table teacher(
id int not null,
`name` varchar(50),
age int,
country varchar(50),
primary key(id));
insert into teacher (id, name, age, country) values (1, "phong", 25, "vietnam");
select * from teacher;