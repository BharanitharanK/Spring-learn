<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student form</title>
</head>
<body>
	<h1>Add new detail</h1>
  <form:form method="post" action="save">
		<table>
			<tr>
				<td>id:</td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td>name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>address:</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>Standard:</td>
				<td><form:input path="std" /></td>
			</tr>
			<tr>
				<td>grade:</td>
				<td><form:input path="grade" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>