
create database db_EMS
use db_EMS

go
create table tbl_User(
[User_Id] int primary key,
[User_Name] varchar(30) not null,
User_Age int not null,
User_Email varchar(40) not null,
User_Password varchar(40) not null
) 

Go
create table tbl_Event(
Event_Id int identity primary key,
[User_Id] int foreign key references tbl_User([User_Id]) not null,
Event_Date date not null,
Event_Time varchar(30) not null,
Event_Title varchar(30) not null,
Event_Colour varchar(30) not null,
Event_Description varchar(40)
)

select * from tbl_Event
select * from tbl_User

