
-- question 2 
select d.name, count(c.id) as course_num
from department d, course c
where d.id = c.deptid
group by d.id
order by course_num, d.name; 


-- question 3 ????
-- course that is most pop o studetns 
-- list of names of each course and the nuber of students in the course 

-- query which lists the name of each course and the number of students in that course 

select c.name, count(sc.studentId) as num_of_student
from course c, studentCourse sc
where c.id = sc.courseId
group by sc.courseId
order by count(sc.studentId) desc, c.name; 


-- question 4
-- list the names of all courses where the faculty assigned to those courses is zero 

-- no output 
select c.name
from course c, facultycourse fc
where c.id = fc.courseId
and fc.facultyId is null; 

-- from couse where couse id is not in select course id in faculty couse 
select c.name
from course c 
where c.id not in (select fc.courseId from facultycourse fc )
order by c.name; 

-- left join gives an output of null 
select c.name 
from course c 
left join 
	facultycourse fc on c.id = fc.courseId is null
order by c.name; 


-- question 5
-- list the course names and number of students in those course for all course where there are 
-- no assigned faculty 

select c.name , count(studentId) as num_of_student
from course c 
left join 
	facultycourse fc on
    c.id = fc.courseId 
left join 
	studentcourse sc on 
    c.id = sc.courseId
group by name
having count( fc.facultyId)  = 0
order by num_of_student desc; 

-- question 6 
-- list total num of students that were enrolled in classes during each school year 
-- col 1 labels "Students" col 3 label "year" 

-- num of students count(studentId) 
-- year(sc.startdate) 
-- group by year 
select count(distinct sc.studentId) as 'Students', year(sc.startDate) as 'Year'
from studentcourse sc 
group by year(sc.startDate)
order by Year asc , Students desc; 

-- question 7 
-- lists the start date and total number of students who erolled in classes in aug each year 

-- start date and total num of students 

select sc.startDate, count(distinct sc.studentId)
from studentcourse sc
where month(sc.startDate) = 08
group by sc.startDate; 


-- question 8 
-- list students first name, last name, number of course they are taking in their major department 

-- student 
-- department 
-- count (courseID) 
-- group by course 

select s.firstname , s.lastname , count(sc.courseId) 
from student s 
join 
	studentcourse sc on 
		(s.id = sc.studentId)
join 
	course c on
		(sc.courseId = c.id)
where s.majorId = c.deptId
group by s.lastname, s.firstname 
order by count(sc.courseId) desc, s.firstname, s.lastname;  




-- question 9 
-- first name, last name. and avg progress 
-- students with prog < 50 % 
-- avg prog rounded on decmial place 



select s.firstname, s.lastname, round(avg(sc.progress), 1) as 'Average Progress' 
from student s 
inner join 
	studentcourse sc on 
		(s.id = sc.studentId)
group by s.lastname, s.firstname
having avg(sc.progress) < 50
order by 'Average Progress' desc ;


-- question 10 
-- list each course name and average progress of students in the course 
-- avg prog displayed one deciaml point 

select c.name, round(avg(sc.progress), 1) 
from studentcourse sc, course c 
where c.id = sc.courseId
group by c.name
order by avg(sc.progress) desc; 


-- question 11 
-- display the avg of course with the highest avg 

select c.name, round(avg(sc.progress), 1) 
from studentcourse sc, course c 
where c.id = sc.courseId
group by c.name
order by avg(sc.progress) desc
limit 1 ;  

-- question 12 
select f.firstname, f.lastname, round(avg(distinct sc.progress), 1) as 'Average Progress' 
from faculty f, facultycourse fc, course c, studentcourse sc
where f.id = fc.facultyId 
and fc.courseId = c.id 
and c.id = sc.courseId
group by f.firstname, f.lastname
order by round(avg(distinct sc.progress), 1) desc; 

-- question 13 

select s.firstname, s.lastname, min(sc.progress) as Minimum, max(sc.progress) as max 
from student s, studentcourse sc 
where s.id = sc.studentId
group by s.firstname, s.lastname;



select s.firstname , s.lastname,
case 
	when min(sc.progress) < 40 then 'F'
    when min(sc.progress) < 50 then 'D'
    when min(sc.progress) < 60 then 'C'
    when min(sc.progress) < 70 then 'B'
    else 'A' 
end as 'Minimum Grade', 
case
	when max(sc.progress) < 40 then 'F'
    when max(sc.progress) < 50 then 'D'
    when max(sc.progress) < 60 then 'C'
    when max(sc.progress) < 70 then 'B'
    else 'A' 
end as 'Maximum Grade'
from student s, studentCourse sc  
where sc.studentId = s.id
group by  s.id
order by min(sc.progress) desc, max(sc.progress) desc, s.firstname, s.lastname; 

select s.firstname , s.lastname,
case 
    when min(sc.progress) < 40 then 'F'
    when min(sc.progress) < 50 then 'D'
    when min(sc.progress) < 60 then 'C'
    when min(sc.progress) < 70 then 'B'
    else 'A' 
end as minGrade, 
case
    when max(sc.progress) < 40 then 'F'
    when max(sc.progress) < 50 then 'D'
    when max(sc.progress) < 60 then 'C'
    when max(sc.progress) < 70 then 'B'
    else 'A' 
end as maxGrade
from student s, studentCourse sc  
where sc.studentId = s.id
group by  s.id
order by minGrade desc, maxGrade desc, s.firstname asc, s.lastname asc; 









