<html>
<body>
<table border=1>
	<tr>
		<th>Name</th>
		<th>Value</th>
		<th>Action</th>
	</tr>
	<?php
		foreach($_COOKIE as $key => $val){
			echo "<tr>
					<td>$key</td>
					<td>$val</td>
					<td><a href='cookieDel.php?name=$key'>Delete</a></td>
				</tr>";
		}
	?>
</table>
<a href="cookie.php" type="button">Set New Cookie</a>
</body>
</html>