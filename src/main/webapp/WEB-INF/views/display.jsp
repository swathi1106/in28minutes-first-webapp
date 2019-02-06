<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h3>Please select an option from the list.</h3>

<form action="/displayList" method="post"> <br/>

<select name="listInfo">
<option value="select">Select</option>
<option value="project">Project</option>
  <option value="todos">Todos</option>
  <option value="party">Party</option>
</select> <br/> <br/>
<input type="submit" value="Submit">

</form> 
</body>
</html>