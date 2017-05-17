<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
  	<meta charset="utf-8">
    <title>All of type</title>
  </head>
  
  <body>
  
    <a href="courseAction_typelist">Click</a>
  
    <h1>CourseType</h1>
    <table border="1">
      <thead>
        <tr>
          <th>类型主键</th>
          <th>类型</th>
        </tr>
      </thead>
      <tbody>
      <s:iterator var="type" value="types">
        <tr>
          <td><s:property value="#type.id" /></td>
          <td><s:property value="#type.type" /></td>
        </tr>
      </s:iterator>
      </tbody>
    </table>
    
    <hr />
    
    <a href="courseAction_list">Click</a>
  
    <h1>Course</h1>
    <table border="1">
      <thead>
        <tr>
          <th>课程编号</th>
          <th>课程类型编号</th>
          <th>课程名</th>
          <th>总课时</th>
          <th>学分</th>
        </tr>
      </thead>
      <tbody>
      <s:iterator var="course" value="courses">
        <tr>
          <td><s:property value="#course.id" /></td>
          <td><s:property value="#course.type.id" /></td>
          <td><s:property value="#course.name" /></td>
          <td><s:property value="#course.totalHours" /></td>
          <td><s:property value="#course.credit" /></td>
        </tr>
      </s:iterator>
      </tbody>
    </table>

	<hr />
	
	
	<a href="courseAction_mclist">Click</a>

    <h1>Major And Course</h1>
    <table border="1">
      <thead>
        <tr>
          <th>专业编号</th>
          <th>专业名字</th>
          <th>课程编号</th>
          <th>课程名</th>
          <th>学分</th>
        </tr>
      </thead>
      <tbody>
      <s:iterator var="mc" value="mcs">
        <tr>
          <td><s:property value="#mc.major.id" /></td>
          <td><s:property value="#mc.major.name" /></td>
          <td><s:property value="#mc.course.id" /></td>
          <td><s:property value="#mc.course.name" /></td>
          <td><s:property value="#mc.course.credit" /></td>
        </tr>
      </s:iterator>
      </tbody>
    </table>

 
 
  </body>
</html>
