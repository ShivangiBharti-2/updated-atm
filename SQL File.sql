show databases;
use banksystem;
create table signupone (formno varchar(40),name varchar(40),fname varchar(40),dob varchar(20),gender varchar(40),email varchar(40),marital varchar(40),address varchar(40),city varchar(40),state varchar(40),pincode varchar(40));
show tables;
select * from signup;
create table signuptwo(formno varchar(40),religion varchar(40),category varchar(40),income varchar(40),educational varchar(40),soccupation varchar(40),panno varchar(40),aadhar varchar(40),seniorcitizen varchar(40),existingaccount varchar(40));
select * from signuptwo;
create table signupthree(formno varchar(40),accountType varchar(40),cardnumber varchar(40),pinnumber varchar(40),facility varchar(40));
select * from signupthree;


create table signupone (formno varchar(40),name varchar(40),fname varchar(40),dob varchar(20),gender varchar(40),email varchar(40),marital varchar(40),address varchar(40),city varchar(40),state varchar(40),pincode varchar(40));
drop table signupone;
create table signup (formno varchar(40),name varchar(40),fname varchar(40),dob varchar(20),gender varchar(40),email varchar(40),marital varchar(40),address varchar(40),city varchar(40),state varchar(40),pincode varchar(40));

select * from log;
create table bank(pin varchar(10), date varchar(50) , type varchar(20) , amount varchar(20));


select * from log;

select * from bank;
create table bank(pin varchar(40), date varchar(50) , type varchar(40) , amount varchar(40));
create table log(formno varchar(40), cardnumber varchar(40), pin varchar(40)); 

