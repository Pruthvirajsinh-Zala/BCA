<?php 
$show=true;
if(isset($_POST['sub'])){
//function login(){
	$uname=$_POST["un"];
	$pass=$_POST["ps"];
	if($uname=="admin" && $pass=="123"){
		echo "in";
		$show=False;
		echo $show;
	} 
	else 
	{
		echo"Invalid";
	}
	
//}
//login();
}
?>

<html>
<body>
<?php if($show===true){?>
<form action="loginsample.php" method="POST">
<label>Username</label>
<input type="text" name="un"><br>
<label>Password</label>
<input name="ps" type="text"><br>
<input type="submit" name="sub" value="Login">
</form>
<?php }else{?>
<?php //if($show===false){ ?>
<form>
<label>Username : <?php echo $uname;?></label> 
<label>Logged In </label>
<input type="submit" name="lout" value="Logout">
</form>
<?php }?>
</body>
</html>






