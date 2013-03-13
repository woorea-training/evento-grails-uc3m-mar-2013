<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="cloud"/>
		<title>Welcome to Grails</title>
	</head>
	<body>
		<div class="row">
			<div class="span12" style="background-color: #F1F1F1">
			<form action="${createLink(action:'save')}" method="POST">
				<label for="name">Nombre:</label>
				<input type="text" name="name" value="${params.name}" />
				<label for="name">Titulo:</label>
				<input type="text" name="title" value="${params.name}" />
				<label for="name">Image:</label>
				<g:select from="${org.cloud.Image.list()}" name="image.id" optionKey="id" optionValue="name" />
				<label for="name">Hardware:</label>
				<g:select from="${org.cloud.VHardware.list()}" name="hardware.id" optionKey="id" optionValue="name" />
				<br />
				<button class="btn btn-primary">Crear</button>
			</form>
			</div>
		</div>
	</body>
</html>