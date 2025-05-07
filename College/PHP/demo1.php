<?php 
	echo "Hello World";
	$a=10;
	$b=20;
	echo "<br>",$a;
	echo "<br>",++$a;
	echo "<br>",$a++;
	echo "<br>",$a--;
	echo "<br>",--$a;
	if($a=$b)
		echo "<br>A is Equal to B";
	elseif($a>$b)
		echo "<br>A is greater than B";
	else
		echo "<br>A is smaller than B";
	echo "<br>".$a+=$b;
	echo "<br>".$a-=$b;
	echo "<br>".$a*=$b;
	echo "<br>".$a/=$b;
	

?>