<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Spring 3 MVC Series - User Manager</title>
	<style type="text/css">
		body {
			font-family: sans-serif;
		}
		.data, .data td {
			border-collapse: collapse;
			width: 100%;
			border: 1px solid #aaa;
			margin: 2px;
			padding: 2px;
		}
		.data th {
			font-weight: bold;
			background-color: #5C82FF;
			color: white;
		}
	</style>
	<script  type="text/javascript" src="/quest/js/jquery-1.10.2.js" ></script>
</head>
 <script type="text/javascript">
        function doAjaxPost() {
        // get the form values
        alert('hi');
        $.ajax({
        	
        	    url: "/quest/secure/saveAnswers", 
        	    type: 'POST', 
        	    dataType: 'json', 
        	    data: "{\"name\":\"hmkcode\",\"id\":2}", 
        	    contentType: 'application/json',
        	    mimeType: 'application/json',
        	    success: function(data) { 
        	        alert(data.id + " " + data.name);
        	    },
        	    error:function(data,status,er) { 
        	        alert("error: "+data+" status: "+status+" er:"+er);
        	    }
        });
        }
        

        
        </script>
<body>

<h2>Register User</h2>

<form:form method="post" action="add.html" commandName="user">

	<table>
	<tr>
		<td><form:label path="firstname"><spring:message code="label.firstname"/></form:label></td>
		<td><form:input path="firstname" /></td> 
	</tr>
	<tr>
		<td><form:label path="lastname"><spring:message code="label.lastname"/></form:label></td>
		<td><form:input path="lastname" /></td>
	</tr>
	<tr>
		<td><form:label path="email"><spring:message code="label.email"/></form:label></td>
		<td><form:input path="email" /></td>
	</tr>
	<tr>
		<td><form:label path="telephone"><spring:message code="label.telephone"/></form:label></td>
		<td><form:input path="telephone" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="<spring:message code="label.user.register"/>"/>
			<input type="button" value="restAjaxCall" onclick="doAjaxPost()">
		</td>
	</tr>
</table>	

<div id="dynamictable">
		<table>
		         <th>
		            <tr>
		         </th>
		</table>
</div>

</form:form>

	
<h3>User List</h3>
<c:if  test="${!empty contactList}">
<table class="data">
<tr>
	<th>Name</th>
	<th>Email</th>
	<th>Telephone</th>
	<th>&nbsp;</th>
</tr>
<c:forEach items="${userList}" var="contact">
	<tr>
		<td>${user.lastname}, ${user.firstname} </td>
		<td>${user.email}</td>
		<td>${user.telephone}</td>
		<td><a href="delete/${user.id}">delete</a></td>
	</tr>
</c:forEach>
</table>

</c:if>

<script type="text/javascript">
$('#dynamictable').append('<table></table>');
var table = $('#dynamictable').children();    
table.append("<tr><td>a</td><td>b</td></tr>");
table.append("<tr><td>c</td><td>d</td></tr>");
</script>
</body>
</html>
