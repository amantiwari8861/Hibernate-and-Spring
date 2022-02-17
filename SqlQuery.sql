use hibernate;

-- type 1 table per class hierarchy
select * from tabperch; 
select * from hibernate_sequence;
drop table tabperch; 
drop table hibernate_sequence;

-- type 2 table per Subclass
select * from tabpersubc;
select * from contractualemployee; 
select * from permanentemployee; 
select * from hibernate_sequences;
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


