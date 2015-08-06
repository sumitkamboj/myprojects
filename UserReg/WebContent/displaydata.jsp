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
<th>First Name</th>
<th>Last Name</th>
<th>Gender</th>
<th>Age</th>
<th>Address</th>
</tr>
<logic:iterate name="userList" id="listUser">
<tr>
<th><bean:write name="listUser" property="firstName"/></th>
<th><bean:write name="listUser" property="lastName"/></th>
<th><bean:write name="listUser" property="gender"/></th>
<th><bean:write name="listUser" property="age"/></th>
<th><bean:write name="listUser" property="address"/></th>
</tr>
</logic:iterate>
</table>

</body>
</html>