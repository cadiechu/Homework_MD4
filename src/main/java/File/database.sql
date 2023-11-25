create database demo1;
use demo1;

create table product
(
    id     int primary key auto_increment,
    media  VARCHAR(255),
    name   varchar(100) not null,
    detail varchar(255),
    price  double       not null,
    status boolean default (true)
);
insert into product (media, name, detail, price, status)
values ('https://cdn.tgdd.vn/Products/Images/42/210653/iphone-11-pro-max-256gb-black-600x600.jpg',
        'Iphone 11 Pro Max',
        '256GB',
        10000000,
        true);
