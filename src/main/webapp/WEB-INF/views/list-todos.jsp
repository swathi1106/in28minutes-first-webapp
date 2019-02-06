<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Todos for ${name}</title>
</head>
<body>
<H1>Your Todos</H1>
 ${todos}
 <a class="button" href="/add-todo">Add</a>
</body>
</html>