<html>
<body>
	<form action="isset.php" method="post">
		Enter Your Name :<input type="text" name="nm"><br>
		Enter Your Age :<input type="text" name="ag"><br>
		<input type="submit" name="submit">
	</form>
</body>
</html>
<?php 
if(isset($_POST['submit'])){
	
	echo "Welcome ".$_POST['nm']."<br>";
	echo "Your Age is ".$_POST['ag'];
}