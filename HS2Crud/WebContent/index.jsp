<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
.errorMessage{color:red;}
.button-view {background-color: blue;color: white;}
.button-curd {background-color: black;color: white;}
.button-save {background-color: green;color: white;}
</style>
</head>
<body>
<a href="report"><button class="button-view" type="button">View</button></a> 
<a href="curdrecord"><button class="button-curd" type="button">Back</button></a>

<div>
	<s:form action="addrecord" method="post" class="container">
		<s:textfield name="name" label="Name" placeholder="Enter your Name"></s:textfield>
		<s:textfield name="mobile" label="Mobile" placeholder="Enter your Mobile"></s:textfield>
		<s:textfield name="email" label="Email" placeholder="Enter your Email"></s:textfield>
		<sx:datetimepicker name="dob" label="DOB" displayFormat="dd-MMM-yyyy" required="true"/>
		<s:submit cssClass="button-save" value="Save"></s:submit>
	</s:form>
	</div>
</body>
</html>