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
	<script src="/Spring3HibernateMaven/js/jquery-1.10.2.js"></script>
        <script type="text/javascript">
        function doAjaxPost() {
        // get the form values
        $.ajax({
        	
        	    url: "/Spring3HibernateMaven/saveAnswers", 
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
	
	
</head>
<body>

<h2>Create New Question</h2>

<form:form method="post" action="add.html" commandName="questionnaire">

	<table>
	<tr>
		<td colspan="2">
		<form:hidden path="question.id"/>
			<form:input path="question.name" />
		</td>
	</tr>
		<tr>
		<td colspan="2">
			<form:input path="question.description" />
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
		<input type="button" name="restAjaxCall" onclick="doAjaxPost()">
			<input type="submit" value="<spring:message code="label.user.register"/>"/>
		</td>
	</tr>
</table>	
</form:form>

	
</body>
</html>
