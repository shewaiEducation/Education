<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
  	<meta charset="utf-8">
    <title>All of classroom's info</title>
  </head>
  
  <body>
  
    <a href="buildAction_buildlist">Click</a>
  
    <h1>teaching building</h1>
    <table border="1">
      <thead>
        <tr>
          <th>教学楼</th>
        </tr>
      </thead>
	  <s:iterator var="build" value="builds">
        <tr>
          <td><s:property value="#build.name" /></td>
        </tr>
      </s:iterator>
      </tbody>
    </table>
    
    <hr />
    
    <a href="buildAction_classroomlist">Click</a>
  
    <h1>Classroom</h1>
    <table border="1">
      <thead>
        <tr>
          <th>教室</th>
        </tr>
      </thead>
	  <s:iterator var="classroom" value="classrooms">
        <tr>
          <td><s:property value="#classroom.name" /></td>
        </tr>
      </s:iterator>
      </tbody>
    </table>
  </body>
</html>
