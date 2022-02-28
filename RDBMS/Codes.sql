USE flipkart;
SELECT * FROM CUSTOMER;
DESC CUSTOMER;
SELECT * FROM ORDERS;
delete from CUSTOMER where grade is null;
SELECT * FROM CUSTOMER FULL JOIN ORDERS ON CUSTOMER.SALESMAN_ID = ORDERS.SALESMAN_ID;
SELECT * FROM empdetailsm;
update CUSTOMER set grade=100 where customer_id=3001;
INSERT INTO CUSTOMER(customer_id,salesman_id) VALUES(3588,5001);
select cust_name from customer where customer_id=3005;
update CUSTOMER set grade=100 where customer_id=3001;

CREATE DATABASE JAVA_TRAINING;
USE JAVA_TRAINING;
CREATE TABLE STUDENTS(ID INT PRIMARY KEY, SNAME VARCHAR(215), CLASS INT, GRADE varchar(10), MARKS INT, DOB date, PLACE VARCHAR(215), PINCODE INT);
select * from students;
desc students;
INSERT INTO STUDENTS VALUES(1,'MUNI RAGHAVA',10,'O',97,'1998/12/28','NELLORE',524421);

CREATE TABLE ARTICLE(ArCode Char(5) PRIMARY KEY,
ArName varchar(30) not null,
Rate Decimal(8,2),
Quantity int default 0,
Class CHAR(1),
Check (ArCode like 'A%'),
check (class in('a','b','c')),
check (Quantity>=0));
use flipkart;
select * from customer;
desc customer;
create table sr_name(Employee_ID int primary key, E_Name varchar(215));
select * from s_name;
select Employee_ID as "Employee ID",E_Name as "Employee Name" from s_name;
select employee_id from s_name;
alter table s_name Change E_name Employee_Name varchar(215);
insert into s_name values(1,'A');
insert into s_name values(2,'A');
insert into s_name values(3,null);
insert into s_name values(4,null);
insert into s_name(Employee_ID,Employee_Name) values(51,'B');
insert into s_name values(31,'C');
