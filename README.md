Create table Login_Credentials
(
Login_Id number(10),
Username varchar2(50) Not Null,
Password varchar2(15) Not Null,
Constraint Login_Id_pk primary key (Login_Id)
);
insert into Login_Credentials values(1065000,'Ritu@gmail.com','Ritu@123');
insert into Login_Credentials values(1065001,'Admin@gmail.com','Admin@123');
insert into Login_Credentials values(1065002,'Jay@gmail.com','Jay@123');
insert into Login_Credentials values(1065003,'shivani@gmail.com','shivani@123');


select * from  Login_Credentials;


Create table Registered_User 
(
Registration_Id number (10),
Name varchar2(30) Not Null,
Username varchar2(30) Not Null,
DOB date Not Null,
ContactNumber number(10)  Not Null,
Password varchar2(20) Not Null,
Role varchar2(10) Not Null,
Constraint Registered_User_Id_pk primary key (Registration_Id)
);

insert into Registered_User values(1,'Ritu','Ritu@gmail.com',TO_DATE('27/01/1998','DD/MM/YYYY'),1236547892,'Ritu@123','ngo');
insert into Registered_User values(2,'Jay','Jay@gmail.com', TO_DATE('01/12/1999','DD/MM/YYYY'),9874563212,'Jay@123','trainee');

select * from  Registered_User;


SELECT *  FROM Login_Credentials lc INNER JOIN Registered_User rc ON lc.Login_Id = rc.Login_Id; 



Create table Training_Sectors
(
Training_Sector_Id number(4),
Training_Sector_Name varchar2(30),
Training_Sector_Courseduration number(10),
Training_Sector_Startdate date,
Training_Sector_Capacity number(10),
Constraint Training_Sector_Id_pk primary key (Training_Sector_Id)
);
insert into Training_Sectors values(101,'Hoticulture',4,TO_DATE('12/01/2020','DD/MM/YYYY'),10);
insert into Training_Sectors values(102,'Zari',5,TO_DATE('12/01/2020','DD/MM/YYYY'),20);
insert into Training_Sectors values(103,'Agriculture',8,TO_DATE('12/01/2020','DD/MM/YYYY'),50);
insert into Training_Sectors values(104,'Food Processing',3,TO_DATE('18/05/2020','DD/MM/YYYY'),35);



select * from Training_Sectors;


Create table NGOs
(
NGO_Id number(10),
Training_Sector_Id number(4),
NGO_Name varchar2(30),
NGO_Email varchar2(30),
NGO_Contactno number(10),
NGO_Location varchar2(30),
NGO_Status varchar2(15),
Constraint NGOs_NGO_Id_pk primary key (NGO_Id),
Constraint Training_Sector_Id_fk foreign key(Training_Sector_Id) references Training_Sectors(Training_Sector_Id)
);

insert into NGOs values(1111,101,'BeingHuman','beinghuman@gmail.com',9029987423,'Bandra','Approved');
insert into NGOs values(2222,102,'WWWCI','wwwci@gmail.com',8790342156,'Mahim','Approved');
insert into NGOs values(3333,103,'WomenRights','womenrights@gmail.com',7845634230,'Kandivali','NotApproved');
insert into NGOs values(4444,103,'Duplicate','womenrights@gmail.com',7845634230,'Kandivali','NotApproved');


select * from NGOs;

Create table Registered_Women
(
Women_Id number(10),
Ngo_Id number(10),
Name varchar2(30) Not Null,
Dob date,
Marriagestatus varchar2(15) Not Null,
Noofchildren number(2) Not Null,
Childage number(2) Not Null,
Contactno number(10) Not Null,
Email varchar2(50) Not Null,
Address varchar2(100)Not Null,
Physicallychallenged varchar2(20) Not Null,
Ageproof varchar2(100) Not Null,
Status varchar2(20) Not Null,
Constraint Women_Id_pk primary key(Women_Id),
Constraint RW_Training_Sector_Id_fk foreign key(Ngo_Id) references NGOs(Ngo_Id));



insert into Registered_Women values(12,3333,'ritu',TO_DATE('27/01/1998','DD/MM/YYYY'),'married',1,2,1236547892,'ritu@gmail.com','nagpur maharashtra','yes','7667576','no');
insert into Registered_Women values(13,2222,'bhavisha',TO_DATE('16/06/1998','DD/MM/YYYY'),'married',1,1,7894644696,'bhavisha@gmail.com','pune maharashtra','yes','3454544','no');
insert into Registered_Women values(14,1111,'priya',TO_DATE('19/08/1998','DD/MM/YYYY'),'unmarried',0,0,9167234137,'priya@gmail.com','south delhi','no','2376677','no');

SELECT *  FROM Training_Sectors ts INNER JOIN Registered_Women rw ON ts.Training_Sector_Id = rw.Training_Sector_Id; 


select * from Registered_Women;


drop table Registered_User;
drop table Login_Credentials;
drop table Registered_Women;
drop table NGOs;
drop table Training_Sectors;

ALTER TABLE Registered_Women 
MODIFY Constraint RW_Training_Sector_Id_fk foreign key(Ngo_Id) references NGOs(Ngo_Id) 
ON DELETE CASCADE;
