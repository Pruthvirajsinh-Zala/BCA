<?php

	
	if(isset($_POST['b1']))
	{
		$a=$_POST['s1'];
		$b=$_POST['font'];
		echo "<b style='font-family:".$b."'>$a</b> ";
	}

?>