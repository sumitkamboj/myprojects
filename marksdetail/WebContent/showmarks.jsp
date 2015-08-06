<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="s" %>
 <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table id="table" border="2">
<tr>
<th>Name</th>
<th>Gender</th>
<th>Roll Number</th>
<th>Age</th>
<th>Subject</th>
<th>Marks</th>
<th>Max Marks</th>
</tr>
<logic:iterate name="studentlist1" id="listStudent">
<tr>
<th><bean:write name="listStudent" property="name"/></th>
<th><bean:write name="listStudent" property="gender"/></th>
<th><bean:write name="listStudent" property="rollno"/></th>
<th><bean:write name="listStudent" property="age"/></th>
<th><bean:write name="listStudent" property="subject"/></th>
<th><bean:write name="listStudent" property="marks"/></th>
<th><bean:write name="listStudent" property="maxMarks"/></th>
</tr>
</logic:iterate>
</table>

</body>
</html>