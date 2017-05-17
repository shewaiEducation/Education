<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
  	<meta charset="utf-8">
    <title>All of college's info</title>
  </head>
  
  <body>
  
    <a href="collegeAction">Click</a>
  
    <h1>College</h1>
    <table>
      <thead>
        <tr>
          <th>学院编号</th>
          <th>学院名字</th>
        </tr>
      </thead>
      <tbody>
      <s:iterator var="college" value="colleges">
        <tr>
          <td><s:property value="#college.id" /></td>
          <td><s:property value="#college.name" /></td>
        </tr>
      </s:iterator>
      </tbody>
    </table>
    
  </body>
</html>
