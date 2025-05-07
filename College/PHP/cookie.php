<html>
<body>
	<form method="post">
		Cookie Name : <input type="text" name="cnm"/>
		Cookie Value : <input type="text" name="cval"/>
		<input type="submit" name="create" value="create"/>
	</form>
</body>
</html>

<?php
if(isset($_POST['create'])){
	setcookie($_POST['cnm'],$_POST['cval'], time() + 3600, "/");
	header("Location: /cookielist.php");
}