<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="cloud"/>
		<title>Welcome to Grails</title>
	</head>
	<body>
		<div class="well">
			<div class="pull-left">
				<a href="${createLink(action : 'create')}" class="btn"><i class="icon-plus"></i> Create</a>
			</div>
			<div class="pull-right">
				<a href="${createLink(action : 'list')}" class="btn"><i class="icon-refresh"></i> Refresh</a>
			</div>
		</div>
		<table class="table table-striped">
		<thead>
			<th>Nombre</th>
			<th>Imagen</th>
			<th>Capacidades</th>
			<th>Acciones rápidas</th>
		</thead>
		<tbody>
			<g:each in="${servers}" var="server">
			<tr>
			<td>${server.name}</td>
			<td>${server.image.name}</td>
			<td>${server.hardware}</td>
			<td>
				<a href="${createLink(action : 'show', id : server.id)}">mostrar</a>
				<a href="${createLink(action : 'edit', id : server.id)}">editar</a>
				<a href="${createLink(action : 'delete', id : server.id)}">borrar</a>
			</td>
			</tr>
			</g:each>
		</tbody>
		</table>
	</body>
</html>