<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<<<<<<< HEAD

<html>
<head>
<title>Yahoo!!</title>
</head>
<body>

Hi ${name} <br/>

<table>
<caption>Your Todos are</caption>
	<thead>
		<tr>
			<th>Description</th>
			<th>Target Date</th>
			<th>Is Completed?</th>
		</tr>
	</thead>
	
	<tbody>
	<c:forEach items="${todos}" var="todo">
		<tr>
			<td>${todo.desc}</td>
			<td>${todo.targetDate}</td>
			<td>${todo.isDone}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

<a class="button" href="/add-todo">Add</a>
=======
<html>
<head>
<title>Todos for ${name}</title>
</head>
<body>
<H1>Your Todos</H1>
 ${todos}
 <a class="button" href="/add-todo">Add</a>
>>>>>>> branch 'master' of https://github.com/swathi1106/in28minutes-first-webapp.git
</body>
</html>