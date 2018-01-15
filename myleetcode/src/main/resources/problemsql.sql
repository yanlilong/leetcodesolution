create database IF NOT EXISTS leetcode;
show leetcode;
use leetcode;
show tables;
create table Employee(Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,Name varchar(20),Salary Integer,ManagerId int);
insert into Employee(Id,Name,Salary,ManagerId) values(1,'Joe',100,3),(2,'Henry',200,4),(3,'Sam',300,Null),(4,'Max',400,NUll);
insert into Employee(Id,Name,Salary,ManagerId) values(1,'Joe',70000,3),(2,'Henry',80000,4),(3,'Sam',60000,Null),(4,'Max',90000,NUll);

--Problem 175:Combine Two Tables
select Person.FirstName,Person.LastName,Address.City,Address.State from Person left join Address on Person.PersonId=Address.PersonId;


--problem 176:Second Highest Salary
select max(Employee.Salary) as SecondHighestSalary from Employee where Employee.Salary<(select MAX(Employee.Salary)from Employee);
select Employee.Salary from Employee where Employee.Salary<(select MAX(Employee.Salary) from Employee)

--177. Nth Highest Salary
insert into Employee(Id,Name,Salary,ManagerId) values(1,'Joe',100,3),(2,'Henry',200,4),(3,'Sam',300,Null),(4,'Max',400,NUll);
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
Declare P INT;
Set P=N-1;
  RETURN (
      # Write your MySQL query statement below.
      select DISTINCT salary from Employee order by salary DESC limit P,1
        );
END

--Problem 181:Employees Earning More Than Their Managers
select employee.Name as Employee from Employee employee,Employee manager where employee.Salary>manager.Salary and employee.ManagerId=manager.Id;


--182. Duplicate Emails
Select DISTINCT p1.Email  from Person p1,Person p2 where p1.Email=p2.Email and p1.Id<>p2.Id;





--183. Customers Who Never Order
select Name as Customers from Customers where  Id not in (select  Name from Customers  RIGHT JOIN  Orders on Orders.CustomerId=Customers.Id);


--196. Delete Duplicate Emails
delete p1 from Person p1,Person p2 where p1.Email=p2.Email and p1.Id>p2.Id;

--197.Rising Temperature
Anwser one: select A.Id as Id from Weather A inner join Weather as B on B.Date=subdate(A.Date, 1) where A.Temperature>B.Temperature;
Anwser two: select A.Id as Id from Weather A, Weather B where B.Date=subdate(A.Date, 1)  and A.Temperature>B.Temperature;

