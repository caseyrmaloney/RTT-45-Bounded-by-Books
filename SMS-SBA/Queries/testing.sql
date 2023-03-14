
-- filling the student table database with students 

insert into Student (email, name, password) values ('hluckham0@google.ru', 'Hazel Luckham', 'X1uZcoIh0dj');
insert into Student (email, name, password) values ('sbowden1@yellowbook.com', 'Sonnnie Bowden', 'SJc4aWSU');
insert into Student (email, name, password) values ('qllorens2@howstuffworks.com', 'Quillan Llorens', 'W6rJuxd');
insert into Student (email, name, password) values ('cstartin3@flickr.com', 'Clem Startin', 'XYHzJ1S');
insert into Student (email, name, password) values ('tattwool4@biglobe.ne.jp', 'Thornie Attwool', 'Hjt0SoVmuBz');
insert into Student (email, name, password) values ('hguerre5@deviantart.com', 'Harcourt Guerre', 'OzcxzD1PGs');
insert into Student (email, name, password) values ('htaffley6@columbia.edu', 'Holmes Taffley', 'xowtOQ');
insert into Student (email, name, password) values ('aiannitti7@is.gd', 'Alexandra Iannitti', 'TWP4hf5j');
insert into Student (email, name, password) values ('ljiroudek8@sitemeter.com', 'Laryssa Jiroudek', 'bXRoLUP');
insert into Student (email, name, password) values ('cjaulme9@bing.com', 'Cahra Jaulme', 'FnVklVgC6r6');


-- this is my temp student that I will use for testing 
insert into student (id, email, name, password) values (11, 'test@testing.com', 'Test Name', 'pass');

select * from student; 



-- filling the course table with courses 
-- got rid of id since its AI 

insert into course (id, student_id, name, instructor) values (1, null, 'English', 'Anderea Scamaden');
insert into course (id, student_id, name, instructor) values (2, null, 'Mathematics', 'Eustace Niemetz');
insert into course (id, student_id, name, instructor) values (3, null, 'Anatomy', 'Reynolds Pastor');
insert into course (id, student_id, name, instructor) values (4, null, 'Organic Chemistry', 'Odessa Belcher');
insert into course (id, student_id, name, instructor) values (5, null, 'Physics', 'Dani Swallow');
insert into course (id, student_id, name, instructor) values (6, null, 'Digital Logic', 'Glenden Reilingen');
insert into course (id, student_id, name, instructor) values (7, null, 'Object Oriented Programming', 'Giselle Ardy');
insert into course (id, student_id, name, instructor) values (8, null, 'Data Structures', 'Carolan Stoller');
insert into course (id, student_id, name, instructor) values (9, null, 'Politics', 'Carmita De Maine');
insert into course (id, student_id, name, instructor) values (10, null, 'Art', 'Kingsly Doxsey');

-- inserting my test case course 
insert into course (id, student_id, name, instructor) values (11, null, 'Test', 'Test Name');

select * from course;



-- checking query for studentcourse 

select * from student_course
where s.email = "test@testing.com";

select * from student_course sc, student s
where s.email = "test@testing.com";

select * from course c, student s 
where s.email = "test@testing.com"; 

select s.id as 'Student Id', s.name as 'Student Name', s.email as 'Student Email', c.name as 'Course Name', c.instructor, sc.course_id as "Course id" 
from student_course sc, student s, course c
where s.id= sc.student_id 
and c.id = sc.course_id
and sc = 11; 

INSERT INTO `SMS`.`student_course`
(
`student_id`,
`course_id`)
VALUES
(
11,
1);

DELETE FROM `SMS`.`student_course`
WHERE id = 22;




