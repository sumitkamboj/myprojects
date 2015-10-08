<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Struts 2 + Spring + Hibernate integration example</h1>
<h2>Add Customer</h2>
<s:form action="addCustomerAction">
  <s:textarea name="password" label="Password" value="" cols="50" rows="5" />
<s:textfield name="name" label="Name" value=""></s:textfield>
<s:textfield name="address" label="Address" value=""></s:textfield>
<s:submit></s:submit>
</s:form>
<h2>All customer</h2>
<s:if test="customerList.size()>0">
<table border="1px" cellpadding="8px">
	<tr>
	<th>Customer Id</th>
	<th>Password</th>
	<th>Name</th>
	<th>Address</th>
	<th>Created Date</th>
	</tr>
<s:iterator value="customerList" status="userStatus">
<tr>
<td><s:property value="customerId"/></td>
<td><s:property value="password"/></td>
<td><s:property value="name"/></td>
<td><s:property value="address"/></td>
<td><s:date name="createdDate" format="dd/MM/yyyy"/></td>
</tr>

</s:iterator>
</table>
</s:if>
<br/>
<br/>
</body>
</html>