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
--truncate table major;
--班级
insert into Class values('1440301','03','计算机科学与技术1401班',date'2014-09-01');
insert into Class values('1440302','03','计算机科学与技术1402班',date'2014-09-01');
insert into Class values('1440303','03','计算机科学与技术1403班',date'2014-09-01');
select * from Class;
--truncate table Class;
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
--truncate table CourseType;
--课程
insert into Course values('0020010040',1,'思想道德修养与法律基础',48,3,null);
insert into Course values('0700810010',2,'计算机科学导论',64,4,null);
insert into Course values('0720810980',4,'可视化程序设计',54,3,null);
insert into Course values('0700810140',2,'数据结构',72,4,null);
insert into Course values('0700810450',3,'网络协议与编程',54,3,null);
truncate table Course;
select * from Course;
--truncate table Course;
--专业&课程
drop sequence seq_MajorCourse;
create sequence seq_MajorCourse 
start with 1 
minvalue 0 
maxvalue 99999 
increment by 1;

insert into MajorCourse values(seq_MajorCourse.Nextval,'0020010040','03',1);
insert into MajorCourse values(seq_MajorCourse.Nextval,'0700810010','03',2);
insert into MajorCourse values(seq_MajorCourse.Nextval,'0720810980','03',3);
insert into MajorCourse values(seq_MajorCourse.Nextval,'0700810140','03',2);
insert into MajorCourse values(seq_MajorCourse.Nextval,'0700810450','03',4);

truncate table MajorCourse;
select * from MajorCourse;
--专业&课程，被选择
drop sequence seq_MajorCourseSelected;
create sequence seq_MajorCourseSelected 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

truncate table MajorCourseSelected;
select * from MajorCourseSelected;
--教师类型
drop sequence seq_teacherType;
create sequence seq_teacherType 
start with 1 
minvalue 0 
maxvalue 99 
increment by 1;

insert into TeacherType values(seq_teacherType.Nextval,'教授');
insert into TeacherType values(seq_teacherType.Nextval,'副教授');
insert into TeacherType values(seq_teacherType.Nextval,'讲师');

truncate table TeacherType;
select * from TeacherType;
--教师
insert into Teacher(id,typeId,name,idcard,Hiredate,sex) values('t1001',1,'萧峰','id1001',date'1998-06-23','男');
insert into Teacher(id,typeId,name,idcard,Hiredate,sex) values('t1002',2,'段誉','id1002',date'1999-08-02','男');
insert into Teacher(id,typeId,name,idcard,Hiredate,sex) values('t1003',3,'慕容复','id1003',date'2003-12-16','男');
insert into Teacher(id,typeId,name,idcard,Hiredate,sex) values('t1004',3,'令狐冲','id1004',date'2005-03-20','男');
insert into Teacher(id,typeId,name,idcard,Hiredate,sex) values('t1005',3,'王语嫣','id1005',date'2010-01-28','女');

truncate table Teacher;
select * from Teacher;
--教学楼
insert into TeachBuild values('一教学楼');
insert into TeachBuild values('二教学楼');
insert into TeachBuild values('三教学楼');
insert into TeachBuild values('四教学楼');
insert into TeachBuild values('五教学楼');
insert into TeachBuild values('六教学楼');
insert into TeachBuild values('七教学楼');
insert into TeachBuild values('八教学楼');
insert into TeachBuild values('九教学楼');

truncate table TeachBuild;
select * from TeachBuild;
--教室
truncate table ClassRoom;
select * from ClassRoom;
--授课安排(课程&教师&教学楼&教室)
drop sequence seq_Arrangement;
create sequence seq_Arrangement 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

truncate table Arrangement;
select * from Arrangement;
--授课班级(教师&班级&星期&节数)
drop sequence seq_TeacherClass;
create sequence seq_TeacherClass 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

truncate table TeacherClass;
select * from TeacherClass;
--学生
truncate table Student;
select * from Student;
--选修课班级
truncate table ClassSelected;
select * from ClassSelected;
--学生所在班级(学生&班级)
drop sequence seq_InClassSelected;
create sequence seq_InClassSelected 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

truncate table InClassselected;
select * from InClassSelected;
--成绩(学生&课程)
drop sequence seq_Score;
create sequence seq_Score 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

truncate table Score;
select * from Score;
--用户
drop sequence seq_LoginUser;
create sequence seq_LoginUser 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

insert into LoginUser values(seq_LoginUser.Nextval,'学生',学号,密码);
insert into LoginUser values(seq_LoginUser.Nextval,'教师',学号,密码);

truncate table LoginUser;
select * from LoginUser;
--管理员
drop sequence seq_Manager;
create sequence seq_Manager 
start with 1 
minvalue 0 
maxvalue 999 
increment by 1;

truncate table Manager;
select * from Manager;


