--ѧԺ
insert into College values('1','�ķ�ѧԺ');
insert into College values('2','����ѧԺ');
insert into College values('3','��еѧԺ');
insert into College values('4','��ϢѧԺ');
select * from College;
--truncate table College;
--רҵ
insert into Major values('01','04','��������');
insert into Major values('02','04','�������');
insert into Major values('03','04','�������ѧ�뼼��');
select * from Major;
--truncate table major;
--�༶
insert into Class values('1440301','03','�������ѧ�뼼��1401��',date'2014-09-01');
insert into Class values('1440302','03','�������ѧ�뼼��1402��',date'2014-09-01');
insert into Class values('1440303','03','�������ѧ�뼼��1403��',date'2014-09-01');
select * from Class;
--truncate table Class;
--�γ�����
drop sequence seq_courseType;
create sequence seq_courseType 
start with 1 
minvalue 0 
maxvalue 99 
increment by 1;

insert into CourseType values(seq_courseType.Nextval,'ͨʶ���޿�');
insert into CourseType values(seq_courseType.Nextval,'רҵ���޿�');
insert into CourseType values(seq_courseType.Nextval,'רҵ��ѡ��');
insert into CourseType values(seq_courseType.Nextval,'רҵ��ѡ��');
insert into CourseType values(seq_courseType.Nextval,'ʵ����ѧ');
select * from CourseType;
--truncate table CourseType;
--�γ�
insert into Course values('',null,'',null,null,'');
select * from Course;
--truncate table Course;
--רҵ&�γ�
drop sequence seq_MajorCourse;
create sequence seq_MajorCourse 
start with 1 
minvalue 0 
maxvalue 99999 
increment by 1;

select * from MajorCourse;
--רҵ&�γ̣���ѡ��
drop sequence seq_MajorCourseSelected;
create sequence seq_MajorCourseSelected 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

select * from MajorCourseSelected;
--��ʦ����
drop sequence seq_teacherType;
create sequence seq_teacherType 
start with 1 
minvalue 0 
maxvalue 99 
increment by 1;
--��ʦ

--��ѧ¥

--����

--�ڿΰ���(�γ�&��ʦ&��ѧ¥&����)
drop sequence seq_Arrangement;
create sequence seq_Arrangement 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;
--�ڿΰ༶(��ʦ&�༶&����&����)
drop sequence seq_TeacherClass;
create sequence seq_TeacherClass 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;
--ѧ��

--ѡ�޿ΰ༶

--ѧ�����ڰ༶(ѧ��&�༶)
drop sequence seq_InClassSelected;
create sequence seq_InClassSelected 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;
--�ɼ�(ѧ��&�γ�)
drop sequence seq_Score;
create sequence seq_Score 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;
--�û�
drop sequence seq_LoginUser;
create sequence seq_LoginUser 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

insert into LoginUser values(seq_LoginUser.Nextval,'ѧ��',ѧ��,����);
insert into LoginUser values(seq_LoginUser.Nextval,'��ʦ',ѧ��,����);
--����Ա
drop sequence seq_Manager;
create sequence seq_Manager 
start with 1 
minvalue 0 
maxvalue 999 
increment by 1;




