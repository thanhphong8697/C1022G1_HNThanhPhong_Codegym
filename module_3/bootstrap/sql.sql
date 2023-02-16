CREATE DATABASE demo;
USE demo;

create table users (
	id int auto_increment primary key,
    `name` varchar(120) not null,
    email varchar(220) not null,
    country varchar (120)
);
insert into users(`name`, email, country) values 
	("Minh", "minh@codegym.vn", "Viet Nam"),
    ("Kante", "kante@che.uk", "Kenia");
    drop table users;
    
select * from users;

update users
set name = ?, email = ?, country = ?
where id = ?;

-- findById
delimiter //
create procedure find_user_by_id (in id int)
begin
select id, name, email, country from users where users.id = id;
end 
// delimiter ;
call find_user_by_id (?);
 -- add
 delimiter //
create procedure insert_user (
in user_name varchar(50),
in user_email varchar(50),
in user_country varchar(50))
begin
insert into users(name, email, country) values (user_name, user_email, user_country);
end 
// delimiter ;
call insert_user(?, ?, ?);

-- list
delimiter //
create procedure list_user (in user_country varchar(45))
begin
select * from users where country like concat ('%', user_country, '%');
end 
// delimiter ;

-- update
delimiter //
create procedure update_user (
in user_name varchar(50),
in user_email varchar(50),
in user_country varchar(50),
in user_id int)
begin
update users
set name = user_name, email = user_email, country = user_country
where id = user_id;
end 
// delimiter ;
call update_user(?, ?, ?, ?);

-- delete
delimiter //
create procedure delete_user (in user_id int)
begin
delete from users where id = user_id;
end 
// delimiter ;
call delete_user (?);