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
insert into Course values('0020010040',1,'˼����������뷨�ɻ���',48,3,null);
insert into Course values('0700810010',2,'�������ѧ����',64,4,null);
insert into Course values('0720810980',4,'���ӻ��������',54,3,null);
insert into Course values('0700810140',2,'���ݽṹ',72,4,null);
insert into Course values('0700810450',3,'����Э������',54,3,null);
truncate table Course;
select * from Course;
--truncate table Course;
--רҵ&�γ�
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
--רҵ&�γ̣���ѡ��
drop sequence seq_MajorCourseSelected;
create sequence seq_MajorCourseSelected 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

truncate table MajorCourseSelected;
select * from MajorCourseSelected;
--��ʦ����
drop sequence seq_teacherType;
create sequence seq_teacherType 
start with 1 
minvalue 0 
maxvalue 99 
increment by 1;

insert into TeacherType values(seq_teacherType.Nextval,'����');
insert into TeacherType values(seq_teacherType.Nextval,'������');
insert into TeacherType values(seq_teacherType.Nextval,'��ʦ');

truncate table TeacherType;
select * from TeacherType;
--��ʦ
insert into Teacher(id,typeId,name,idcard,Hiredate,sex) values('t1001',1,'����','id1001',date'1998-06-23','��');
insert into Teacher(id,typeId,name,idcard,Hiredate,sex) values('t1002',2,'����','id1002',date'1999-08-02','��');
insert into Teacher(id,typeId,name,idcard,Hiredate,sex) values('t1003',3,'Ľ�ݸ�','id1003',date'2003-12-16','��');
insert into Teacher(id,typeId,name,idcard,Hiredate,sex) values('t1004',3,'�����','id1004',date'2005-03-20','��');
insert into Teacher(id,typeId,name,idcard,Hiredate,sex) values('t1005',3,'������','id1005',date'2010-01-28','Ů');

truncate table Teacher;
select * from Teacher;
--��ѧ¥
insert into TeachBuild values('һ��ѧ¥');
insert into TeachBuild values('����ѧ¥');
insert into TeachBuild values('����ѧ¥');
insert into TeachBuild values('�Ľ�ѧ¥');
insert into TeachBuild values('���ѧ¥');
insert into TeachBuild values('����ѧ¥');
insert into TeachBuild values('�߽�ѧ¥');
insert into TeachBuild values('�˽�ѧ¥');
insert into TeachBuild values('�Ž�ѧ¥');

truncate table TeachBuild;
select * from TeachBuild;
--����
truncate table ClassRoom;
select * from ClassRoom;
--�ڿΰ���(�γ�&��ʦ&��ѧ¥&����)
drop sequence seq_Arrangement;
create sequence seq_Arrangement 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

truncate table Arrangement;
select * from Arrangement;
--�ڿΰ༶(��ʦ&�༶&����&����)
drop sequence seq_TeacherClass;
create sequence seq_TeacherClass 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

truncate table TeacherClass;
select * from TeacherClass;
--ѧ��
truncate table Student;
select * from Student;
--ѡ�޿ΰ༶
truncate table ClassSelected;
select * from ClassSelected;
--ѧ�����ڰ༶(ѧ��&�༶)
drop sequence seq_InClassSelected;
create sequence seq_InClassSelected 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

truncate table InClassselected;
select * from InClassSelected;
--�ɼ�(ѧ��&�γ�)
drop sequence seq_Score;
create sequence seq_Score 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

truncate table Score;
select * from Score;
--�û�
drop sequence seq_LoginUser;
create sequence seq_LoginUser 
start with 1 
minvalue 0 
maxvalue 999999 
increment by 1;

insert into LoginUser values(seq_LoginUser.Nextval,'ѧ��',ѧ��,����);
insert into LoginUser values(seq_LoginUser.Nextval,'��ʦ',ѧ��,����);

truncate table LoginUser;
select * from LoginUser;
--����Ա
drop sequence seq_Manager;
create sequence seq_Manager 
start with 1 
minvalue 0 
maxvalue 999 
increment by 1;

truncate table Manager;
select * from Manager;


