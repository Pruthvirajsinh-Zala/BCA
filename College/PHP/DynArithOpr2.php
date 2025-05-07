<?php 
$a=$_POST['v1'];
$b=$_POST['v2'];
if(isset($_POST["bt1"])){
	echo "Addition is ".($a+$b);
}
if(isset($_POST["bt2"])){
	echo "Subtraction is ".($a-$b);
}
if(isset($_POST["bt3"])){
	echo "Multiplication is ".($a*$b);
}
if(isset($_POST["bt4"])){
	echo "Division is ".($a/$b);
}