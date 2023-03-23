create schema quanlydiem;
use quanlydiem;

create table users(
	`id` int auto_increment not null,
    `username` varchar(255) not null,
    `password` varchar(50) not null,
    `first_name` nvarchar(255) not null,
    `last_name` nvarchar(10) not null,
	`age` int not null,
    `address` nvarchar(255),
    `phone_number` varchar(20) not null,
    `email` varchar(50),
    `note` nvarchar(255),
    `role` varchar(50) not null,
    primary key (id)
);

insert into users(`username`, `password`, `first_name`, `last_name`, `age`, `address`, `phone_number`, `email`, `note`, `role`) values
("admin", "admin", "Thanh", "Sơn", 23, "Hà Nội", "091234567", "pts.notexist@gmail.com", "", "admin");