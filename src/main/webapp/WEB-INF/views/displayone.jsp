<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
   $('.DONOTUSE').find('option:contains("DO NOT USE")').hide();
});
</script>
</head>
<body>
<h3>Please select an option from the list.</h3>

<form:form method ="post" modelAttribute="displayForm" action="/displayoneList">
	<form:select class="DONOTUSE" path="listinfo"> 
	<form:options items="${map}"/>
	</form:select>
	<input type="submit" value="Submit">
 </form:form>




</body>
</html>