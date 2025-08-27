use lesson18_exam;
SET FOREIGN_KEY_CHECKS = 0;

-- table Student 
drop table T01_Student;

create table T01_Student (
    T01_Student_Id int AUTO_INCREMENT PRIMARY KEY,
    T01_name varchar(255) not null,
    T01_gender varchar(10) not null,
    T01_class_id int, 
	constraint fk_T01_TO2 FOREIGN KEY (T01_class_id) REFERENCES T03_Class(T03_Class_ID)
);

-- table Result

create table T02_Result (
   T02_Student_Id int auto_increment ,
   T02_subject varchar(255),
   T02_score int not null,
   primary key( T02_Student_Id, T02_subject),
   constraint fk_t02_to1 foreign key (T02_Student_Id) references T01_Student(T01_Student_Id)
);
-- table Class

create table T03_Class (
  T03_Class_ID int AUTO_INCREMENT PRIMARY KEY,
  T03_name varchar(255),
  T03_teacher varchar(255)
);
