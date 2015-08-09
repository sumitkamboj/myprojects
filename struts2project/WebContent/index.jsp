<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Basic Demonstration with Struts2</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script src="js/jquery.autocomplete.js"></script>
<script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>

<script>
jQuery(function(){
$("#country").autocomplete("list.jsp");
});
var $j=$.noConflict( true );
$j(document).ready(function(){
	$j("#cpuTable [id^=YTD], #cpuTable [id^=price]").on("keyup", function() {
	    var $jtr = $j(this).closest("tr");
	    var ytd = parseInt($j("[id^=YTD]", $jtr).val());
	    var price = parseInt($j("[id^=price]", $jtr).val());

	       $j("[id^=cpuPrice]", $jtr).val(price/ytd);
	});
	});
</script>
<%-- <script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
$("#cpuTable [id^=YTD], #cpuTable [id^=price]").on("keyup", function() {
    var $tr = $(this).closest("tr");
    var ytd = parseInt($("[id^=YTD]", $tr).val());
    var price = parseInt($("[id^=price]", $tr).val());

       $("[id^=cpuPrice]", $tr).val(price/ytd);
});
});
</script> --%>
</head>
<body>
<br><br><center>
<font face="verdana" size="2">
<font size="4">Java(jsp)/jQuery Autocompleter Example ::: <font color="#809e02">Java4s.com</font></font>
<br><br><br><br>
<s:form action="instname">
<s:textfield id="country" label="Select country" key="libCode">

</s:textfield>
<s:submit></s:submit>
</s:form> 

<!-- Select Country   :
<input type="text" id="country" name="country"/>
 --> 
</font>

<h3>All Records:</h3>  
<%-- <s:form action="instname">
<s:textfield label="Enter code" key="libCode">

</s:textfield>
<s:submit></s:submit>
</s:form> --%>
<%-- <s:set name="#checking" value="list"/> --%>
<s:if test="%{list.size()>0}">
<table id="cpuTable" border="2">
	<tr>
		<th>InstitutionCode</th>
		<th>YTD</th>
		<th>Price</th>
		<th>Cost Per Use</th></tr>
<s:iterator value="list">
<tr>
	<td><s:property value="institutionName"/>
	</td>
	<td><input type="text" id="YTD<s:property value='YTD'/>" name="quantity1" value="<s:property value="YTD"/>"readonly/>
	</td>
	<td><input type="text" id="price<s:property value='YTD'/>" name="weight1" /></td>
	<td><input type="text" id="cpuPrice<s:property value='YTD'/>" name="sub_total1" /></td>
</tr>
	</s:iterator>
</table>
</s:if>
<s:else>
No Data Recieved!
</s:else>
<%-- <s:iterator  value="list">  
<fieldset>  list[#list.index]
<s:property value="institutionName"/><br/>  
<s:property value="YTD"/><br/>  

</fieldset>  
</s:iterator>  --%> 
</body>
</html>