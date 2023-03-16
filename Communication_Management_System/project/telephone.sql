create database telephone
use telephone

create table Administrator
(
  Admin_id int primary key identity(1,1),
  Name varchar(30),
 Username nvarchar(50) not null unique,
  Password nvarchar(50)not null,
  )
 insert into Administrator values('admin','123')
create table Emp_detail
(
  Emp_id int primary key identity(1,1),
  Emp_username varchar(30) not null unique,
  Emp_pass varchar(30) not null,
  Emp_name varchar(30) not null,
  Emp_cell varchar(30) not null unique,
  Emp_nic varchar(30) not null unique,
  Date_and_time varchar(30)not null,
  Emp_address varchar(50) not null, 
)

create table customer
(
  cus_id int primary key identity(1,1),
  cus_name varchar(30),
  cus_cell nvarchar(30) unique,
  cus_nic nvarchar(30) unique,
  cus_adress nvarchar(50),
  
)


create table mobile_num
(
   mob_id int primary key identity(1,1),
   mobile_number varchar(30) not null unique,
   status varchar(30),
)


create table Lnadline_num
(
  LandLine_id int primary key identity(1,1),
   LandLine_number varchar(30) not null unique,
   status varchar(30),
)


create table Mobile_pakage
(
  pack_id int primary key identity(1,1),
  Pakage_name varchar(50) not null,
  pakage_Price int not null,
  Status varchar(50)
)


create table Landline_package
(
   pack_id int primary key identity(1,1),
  Pakage_name varchar(50) not null,
  pakage_Price int not null,
  Status varchar(50)
)
select * from Landline_package

select Emp_id , Emp_username , Emp_pass  
from Emp_detail 
where Emp_username='nomid' and Emp_pass='123456'

create table Mobile_Registration
(
  Reg_id int primary key identity(1,1),
  Emp_id varchar(10) Not Null,
  Emp_name varchar(30),
  cus_id int Not NUll,
  cus_name varchar(30),
  Mobile_num varchar(30) unique,
  country varchar(30),
  City varchar(30),
  Date varchar(30),
  Time varchar(30),
  Con_Mode varchar(30),
  Con_Type varchar(30),
  package_name varchar(30), 
)


create table LandLine_Registration
(
  Reg_id int primary key identity(1,1),
  Emp_id varchar(10) Not Null,
  Emp_name varchar(30),
  cus_id int Not NUll,
  cus_name varchar(30),
  LandLine_num varchar(30) unique,
  country varchar(30),
  City varchar(30),
  Date varchar(30),
  Time varchar(30),
  Con_Mode varchar(30),
  Con_Type varchar(30),
  package_name varchar(30), 
)


select * from Administrator
select * from Emp_detail
select * from customer
select * from mobile_num
select * from Mobile_pakage
select * from Lnadline_num
select * from Landline_package
select * from Mobile_Registration
select * from LandLine_Registration

