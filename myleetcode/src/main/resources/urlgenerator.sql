create database urlgenerator;
create table url(Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,longurl varchar(2083),shorturl varchar(80));
show tables;
create table customer(Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,name varchar(100) NOT NULL,email varchar(255),created_date date NOT NULL);
insert into customer(Id,name,email,created_date) values(1,'Martin','martin@gmx.de','2017-02-11');
insert into customer(Id,name,email,created_date) values(2,'yflow','yflow@gmx.de','2017-02-12');
insert into customer(Id,name,email,created_date) values(3,'mudat','mudat@gmx.de','2017-02-12');


