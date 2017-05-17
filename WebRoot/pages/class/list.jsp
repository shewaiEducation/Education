<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
  	<meta charset="utf-8">
    <title>All of class's info</title>
  </head>
  
  <body>
  
    <a href="classAction">Click</a>
  
    <h1>Class</h1>
    <table>
      <thead>
        <tr>
          <th>班级编号</th>
          <th>专业</th>
          <th>班级名字</th>
          <th>开班时间</th>
        </tr>
      </thead>
      <tbody>
      <s:iterator var="class" value="classes">
        <tr>
          <td><s:property value="#class.id" /></td>
          <td><s:property value="#class.major.id" /></td>
          <td><s:property value="#class.name" /></td>
          <td><s:property value="#class.openTime" /></td>
        </tr>
      </s:iterator>
      </tbody>
    </table>
    
  </body>
</html>
