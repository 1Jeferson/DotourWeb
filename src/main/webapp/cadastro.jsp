<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cadastrar</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet" href="./Css/formstyle.css">
<link rel="stylesheet" href="./Css/style.css">
<link rel="webisite icon" type="logo"
	href="./imagens/DT LOGO.png">
</head>
<body>
<body>

	<main>
		<div id="login-box">
			<div class="esquerda">
				<h1>Cadastro</h1>

				<form action="CreateController" method="post">
					<input type="text" name="usuario" placeholder="Usuário" required>
					<input type="text" name="email" placeholder="E-mail" required>
					<input type="password" name="senha" placeholder="Senha" required>
					<input type="text" name="cpf" placeholder="Digite o CPF" required>

					<input type="submit" name="signup_submit" value="Cadastrar">
				</form>
			</div>

			<div class="direita">
				<span class="logincom">Entrar com <br />Rede social
				</span>
				<button class="social-signin google">Login com Google+</button>
				<a class="voltar" href="index.html">Voltar</a>
			</div>
			<div class="ou">OU</div>
		</div>

	</main>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
	crossorigin="anonymous"></script>
</body>

</html>