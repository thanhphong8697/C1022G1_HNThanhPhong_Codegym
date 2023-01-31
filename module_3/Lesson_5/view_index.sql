create database view_index_sp;
use view_index_sp;
create table products (
    id int auto_increment primary key,
    product_code varchar(10),
    product_name varchar(50),
    product_price double,
    product_amount int,
    product_description varchar(40),
    product_status varchar(50)
);
insert into products (product_code, product_name, product_price, product_amount, product_description, product_status) VALUES 
("1a", "muổng", 10000, 10, "kim loại", "còn hàng"),
("2a", "dĩa", 30000, 0, "thuỷ tinh", "hết hàng"),
("3a", "bát", 20000, 5, "sứ", "còn hàng");
select 
    *
from
    products;
create unique index index_product_code on products(product_code);
create index index_product_composite on products(product_name, product_price);

explain select * from products
where product_code = "1a";
explain select * from products
where product_name = "bát";
explain select * from products
where product_price = "30000";

create view view_product (product_code_view , product_name_view , product_price_view , product_status_view) AS
    select 
        product_code, product_name, product_price, product_status
    from
        products;
select 
    *
from
    view_product;
update view_product 
set 
    product_price_view = 15000
where
    product_code_view = '1a';
drop view view_product;

delimiter // 
create procedure list_product()
begin
select * from products;
end 
// delimiter ;
call list_product;

delimiter // 
create procedure add_product(
 add_product_code varchar(10),
    add_product_name varchar(50),
    add_product_price double,
    add_product_amount int,
    add_product_description varchar(40),
    add_product_status varchar(50)
)
begin
insert into products (product_code, product_name, product_price, product_amount, product_description, product_status) values  
(add_product_code, add_product_name, add_product_price, add_product_amount, add_product_description, add_product_status);
end
// delimiter ;
call add_product("4a", "đũa", 10000, 10, "tre", "còn hàng");

delimiter // 
create procedure edit_product(
edit_id int,
 edit_product_code varchar(10),
    edit_product_name varchar(50),
    edit_product_price double,
    edit_product_amount int,
    edit_product_description varchar(40),
    edit_product_status varchar(50)
)
begin
update products
set 
products.product_code = edit_product_code,
products.product_name = edit_product_name,
products.product_price = edit_product_price,
products.product_amount = edit_product_amount,
products.product_description = edit_product_description,
products.product_status = edit_product_status
where 
products.id = edit_id;
end
// delimiter ;

delimiter // 
create procedure delete_product(id int) 
begin
delete from products
where products.id = id;
end
// delimiter ;
call delete_product(4);



