<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script>
$(document).ready(function(){
   //$('.DONOTUSE').find('option:contains("DO NOT USE")').hide();
});
</script>
</head>
<body>
<h3>Please select an option from the list.</h3>

<form action="/displayList" method="post"> <br/>

<select id="DONOTUSE" class="DONOTUSE" name="listInfo">

<option value="select">Select</option>
<option id="test" value="project">DO NOT USE</option>
  <option value="todos">DO NOT USE</option>
  <option value="party">DO NOT USE</option>
  <option value="party">ASSOC CAPE GIRARDEAU (JACKSON)</option>
  <option value="party">DO NOT USE</option>
  <option value="party">ASSOCIATE DIV BOLLINGER</option>
  <option value="party">ASSOCIATE DIV PERRY</option>
  <option value="party">DO NOT USE</option>
  <option value="party">CAPE GIRARDEAU (CAPE GIRARD)</option>
  <option value="party">DO NOT USE</option>
  <option value="party">DO NOT USE</option>
  <option value="party">JUVENILE OFFICE CAPE GIRARDEAU</option>
  <option value="party">JUVENILE OFFICE PERRY</option>
  <option value="party">DO NOT USE</option>
  <option value="party">PERRY</option>
</select> <br/> <br/>
<input type="submit" value="Submit">

</form> 
</body>
</html>