<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="css/bootstrap.min.css"/>
<link rel="stylesheet" href="js/bootstrap.min.js"/> 

<style type="text/css">

table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;} 

.button-update {background-color: #008CBA;color: white;}
.button-delete {background-color: red;color: white;}
.button-curd {background-color: black;color: white;margin-left: 50%;}
</style>

</head>
<body>

<h1 class="text-primary"><center>List of Employee</center></h1>

 <div  style="margin-top: 40px;" class="table-responsive">
 
<table border="1" class="table table-striped">
<tr class="table-danger">
<th>Name</th>
<th>Mobile</th>
<th>Email</th>
<th>DOB</th>
<th>Action1</th>
<th>Action2</th>
</tr>
<s:iterator value="empList">
<tr>
<td><s:property value="name"></s:property></td>
<td><s:property value="mobile"></s:property></td>
<td><s:property value="email"></s:property></td>
<td><s:property value="dob"></s:property></td>
<td><a href="updatedetails.action?id=<s:property value="id"/>"><button class="button-update" type="button">Update</button></a></td>
<td><a href="deleterecord.action?id=<s:property value="id"/>"><button class="button-delete" type="button">Delete</button></a></td>
</tr>
</s:iterator>
</table>
</div>
<br>
<a href="curdrecord"><button class="button-curd" type="button">Back</button></a>

</body>
</html>