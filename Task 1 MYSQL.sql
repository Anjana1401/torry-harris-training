create table regions (
region_id int unsigned not null primary key, 
region_name varchar(50));
create table country(
country_id char not null primary key,
 country_name varchar(50),
 region_id int unsigned not null);
create table location(
location_id int unsigned not null auto_increment primary key, 
location_name varchar(50),
street_address varchar(30),
postal_code varchar(30),
city varchar(20) not null,
state_province varchar(30),
country_id char not null);
create table department(
department_id int unsigned not null primary key, 
department_name varchar(50) not null,
manage_id int unsigned,
location_id int unsigned);
create table jobs(
job_id varchar(20) not null primary key,
 joy_tittle varchar(50) not null,
 min_salary decimal unsigned,
 max_salary decimal unsigned);
create table employee(
employee_id int unsigned primary key, 
first_name varchar(50),
last_name varchar(50) not null ,
email varchar(50) not null ,
phone_number int ,
hire_date date not null,
job_id varchar(10) not null,
salary decimal not null,
commission_pct decimal,
manage_id int unsigned,
department_id int unsigned);
create table job_history(
employee_id int unsigned  not null, 
start_date date not null,
end_date date not null,
job_id varchar(10) not null, 
department_id int unsigned not null);
desc job_history;
alter table job_history drop primary key ;
alter table job_history add primary key (
employee_id,start_date);
alter table  country add foreign key (
region_id) references regions(
region_id);
alter table  location add foreign key (
country_id) references country(
country_id);
alter table  department add foreign key (
location_id) references location(
location_id);
alter table  employee add foreign key (
job_id) references jobs(
job_id);
alter table  employee add foreign key (
department_id) references department(
department_id);
alter table  employee add foreign key (
manage_id) references employee(
employee_id);
alter table  department add foreign key (
manage_id) references employee(
employee_id);
alter table  job_history add foreign key (
employee_id) references employee(
employee_id);
alter table  job_history add foreign key (
job_id) references jobs(
job_id);
alter table  job_history add foreign key (
department_id) references department(
department_id); 
desc regions;
desc country;
desc department;
desc location;
desc employee;
desc jobs;
desc job_history;
insert into regions values (1,"europe");
insert into regions values (2,"europe");
insert into regions values (3,"India");
insert into country values (2,"europe",2);
insert into country values (3,"India",3);
insert into country values (4,"Europe",4);
insert into location values (
1200,'2017 shinjuku-ku',
'1689','tokyo',
'Tokyo Prefecture',
'tokyo state','e');
insert into location values (
1201,'2018 shinki',
'1690','tokyo',
'Japan Prefecture',
'japan state','j');
insert into location values (
1202,'2019 shiuku',
'1691','tokyo',
'Pakistan Prefecture',
'Pakisthan state',
'p');
set foreign_key_checks=0;
insert into department values (
10,
'administration',
200,1700);
insert into department values (
11,
'management',
201,
1701);
insert into department values (
12,
'finance',
202,
1702);
insert into jobs values (
'AS_VP',
'AdministrationVice President',
15000,
30000);
insert into jobs values (
'AS_IP',
'Administration President',
15001,
30001);
insert into jobs values (
'AS_JP',
'Administration associate President',
15002,
30002);
select* from jobs;
insert into employee values(
5962,
'Anjana',
'Krishna',
'Anjana',
'953701',
STR_TO_DATE('14-JAN-2000','%d-%M-%Y'),
'AS_VP',
24000,
NULL,NULL,
90);
insert into employee values(
563,
'Sanjana',
'sanjeev',
'sanjana',
'95370',
STR_TO_DATE('15-JAN-2000','%d-%M-%Y'),
'AS_IP',
24000,
NULL,NULL,
90);
insert into employee values(
564,
'chandana',
'pradeep',
'chandana',
'95701',
STR_TO_DATE('16-JAN-2000','%d-%M-%Y'),
'AS_JP',
24000,
NULL,NULL,
90);
insert into job_history values(
5962,
STR_TO_DATE('26-MAR-2002','%d-%M-%Y'),
STR_TO_DATE('22-MAR-2004','%d-%M-%Y'),
'AS_VP',
'10');
insert into job_history values(
563,
STR_TO_DATE('27-MAR-2002','%d-%M-%Y'),
STR_TO_DATE('23-MAR-2004','%d-%M-%Y'),
'AS_IP',
'11');
insert into job_history values(
564,STR_TO_DATE('28-MAR-2002','%d-%M-%Y'),
STR_TO_DATE('24-MAR-2004','%d-%M-%Y'),
'AS_JP',
'12');
select* from regions;
select* from country;
select* from location;
select* from department;
select* from jobs;
select* from employee;
select* from job_history;
