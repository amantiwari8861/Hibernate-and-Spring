drop database hibernate;
create database hibernate;
use hibernate;
show tables;

-- type 1 table per class hierarchy
select * from tabperch; 
select * from hibernate_sequence;
drop table tabperch; 
drop table hibernate_sequence;

-- type 2 table per Subclass
-- 3 different tables with foreignkey
select * from tabpersubc;
select * from contractualemployee; 
select * from permanentemployee; 
select * from hibernate_sequence;
describe contractualemployee; 
drop table tabperconc; 
drop table contractualemployee; 
drop table permanentemployee; 
drop table hibernate_sequences;

-- type 3 table per concrete class
select * from tabperconc; 
select * from contractualemployee; 
select * from permanentemployee; 
select * from hibernate_sequences;
drop table tabperconc; 
drop table contractualemployee; 
drop table permanentemployee; 
drop table hibernate_sequences;


-- 
select * from collections;
select * from email;
select * from emails;
select * from phonenumber;


describe collections;


create table employee (id int,name varchar(50),email varchar(50), address varchar(50), age int,salary float, phonenumber long);

select * from employee;
delete from employee where id=101;
update employee set name=null where name="ritesh";
