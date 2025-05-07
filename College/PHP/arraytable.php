<html>
<?php 
$info=array(
	"Name"=>"ABC",
	"Age"=>20,
	"Email"=>"abc@xyz.com",
	"Address"=>"Rajkot",
	"Mobile_No"=>987654321,
	"Gender"=>"Male"
);
?>
<body>
<h2>Personal Information</h2>
<table border=2>
	<tr>
		<td>Name</td>
		<td><?php echo $info['Name']?></td>
	</tr>
	<tr>
		<td>Age</td>
		<td><?php echo $info['Age']?></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><?php echo $info['Email']?></td>
	</tr>
	<tr>
		<td>Address</td>
		<td><?php echo $info['Address']?></td>
	</tr>
	<tr>
		<td>Mobile_no</td>
		<td><?php echo $info['Mobile_No']?></td>
	</tr>
	<tr>
		<td>Gender</td>
		<td><?php echo $info['Gender']?></td>
	</tr>
</table>
</body>
</html>