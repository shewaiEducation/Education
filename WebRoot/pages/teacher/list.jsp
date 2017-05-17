<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
  	<meta charset="utf-8">
    <title>All of teacher's info</title>
  </head>
  
  <body>
  
    <a href="teacherAction_typelist">Click</a>
  
    <h1>TeacherType</h1>
    <table border="1">
      <thead>
        <tr>
          <th>教师类型</th>
        </tr>
      </thead>
	  <s:iterator var="type" value="types">
        <tr>
          <td><s:property value="#type.type" /></td>
        </tr>
      </s:iterator>
      </tbody>
    </table>
    
    <hr />
    
    <a href="teacherAction_list">Click</a>
  
    <h1>Teacher</h1>
    <table border="1">
      <thead>
        <tr>
          <th>教师工号</th>
          <th>教师类型</th>
          <th>教师名字</th>
          <th>身份证号</th>
          <th>入职日期</th>
          <th>性别</th>
        </tr>
      </thead>
	  <s:iterator var="teacher" value="teachers">
        <tr>
          <td><s:property value="#teacher.id" /></td>
          <td><s:property value="#teacher.type.type" /></td>
          <td><s:property value="#teacher.name" /></td>
          <td><s:property value="#teacher.idcard" /></td>
          <td><s:date name="#teacher.hiredate" format="yyyy-MM-dd" /></td>
          <td><s:property value="#teacher.sex" /></td>
        </tr>
      </s:iterator>
      </tbody>
    </table>
    
  </body>
</html>
