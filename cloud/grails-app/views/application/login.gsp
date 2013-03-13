

<form action="${createLink(controller:'application',action:'login')}" method="POST">
<input type="text" name="username" value="${params.username}" />
<input type="password" name="password" value="${params.username}" />
<button>Login</button>
</form>