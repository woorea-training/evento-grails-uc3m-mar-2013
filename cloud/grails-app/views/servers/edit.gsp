<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="cloud"/>
		<title>Welcome to Grails</title>
	</head>
	<body>
		<form action="${createLink(action:'update')}" method="POST">
		<input type="text" name="name" value="${params.name}" />
		<button>Actualizar</button>
		</form>
	</body>
</html>