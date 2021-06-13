<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
<link rel="stylesheet" href="js/bootstrap.min.js"/>
<style type="text/css">
.button-view{background-color: blue;color: white;}
.button-update{background-color: green;color: white;}
</style>
</head>
<body>

<a href="report"><button class="button-view" type="button">View</button></a>

<s:form action="updatedetail" method="get">
<pre>
<s:hidden name="employee.id" value="%{employee.id}"></s:hidden>
<s:textfield name="employee.name" label="Name" value="%{employee.name}"></s:textfield>
<s:textfield name="employee.mobile" label="Mobile" value="%{employee.mobile}"></s:textfield>
<s:textfield name="employee.email" label="Email" value="%{employee.email}"></s:textfield>
<sx:datetimepicker name="employee.dob" label="DOB" value="%{employee.dob}" displayFormat="dd-MMM-yyyy" required="true"/>
<s:submit cssClass="button-update" value="update"></s:submit> 
 </pre>
 
</s:form>
</body>
</html>