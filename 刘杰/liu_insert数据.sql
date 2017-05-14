--学院
insert into College values('1','文法学院');
insert into College values('2','管理学院');
insert into College values('3','机械学院');
insert into College values('4','信息学院');
select * from College;
--truncate table College;
--专业
insert into Major values('01','04','电子商务');
insert into Major values('02','04','软件工程');
insert into Major values('03','04','计算机科学与技术');
select * from Major;
--班级
insert into Class values('1440301','03','计算机科学与技术1401班',date'2014-09-01');
insert into Class values('1440302','03','计算机科学与技术1402班',date'2014-09-01');
insert into Class values('1440303','03','计算机科学与技术1403班',date'2014-09-01');
select * from Class;
--课程类型
drop sequence seq_courseType;
create sequence seq_courseType 
start with 1 
minvalue 0 
maxvalue 99 
increment by 1;

insert into CourseType values(seq_courseType.Nextval,'通识必修课');
insert into CourseType values(seq_courseType.Nextval,'专业必修课');
insert into CourseType values(seq_courseType.Nextval,'专业限选课');
insert into CourseType values(seq_courseType.Nextval,'专业任选课');
insert into CourseType values(seq_courseType.Nextval,'实践教学');
select * from CourseType;
--课程
insert into Course values('',null,'',null,null,'');

--专业&课程
drop sequence seq_MajorCourse;
create sequence seq_MajorCourse 
start with 1 
minvalue 0 
maxvalue 99999 
increment by 1;
--专业&课程，被选择
drop sequence seq_MajorCourseSelected;
create sequence seq_MajorCourseSelected 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;
--教师类型
drop sequence seq_teacherType;
create sequence seq_teacherType 
start with 1 
minvalue 0 
maxvalue 99 
increment by 1;
--教师

--教学楼

--教室

--授课安排(课程&教师&教学楼&教室)
drop sequence seq_Arrangement;
create sequence seq_Arrangement 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;
--授课班级(教师&班级&星期&节数)
drop sequence seq_TeacherClass;
create sequence seq_TeacherClass 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;
--学生

--选修课班级

--学生所在班级(学生&班级)
drop sequence seq_InClassSelected;
create sequence seq_InClassSelected 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;
--成绩(学生&课程)
drop sequence seq_Score;
create sequence seq_Score 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;
--用户
drop sequence seq_LoginUser;
create sequence seq_LoginUser 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;
--管理员
drop sequence seq_Manager;
create sequence seq_Manager 
start with 1 
minvalue 0 
maxvalue 999 
increment by 1;




