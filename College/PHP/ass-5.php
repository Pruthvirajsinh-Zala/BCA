<html>
<body>
<form method="POST">
Number 1: <input type="number" name="num1"><br><br>
Number 2: <input type="number" name="num2"><br><br>
Number 3: <input type="number" name="num3"><br><br>
<input type="submit" value="Submit" name="sub">
</form>
</body>
</html>
<?php
if(isset($_POST['sub'])){
$num1 = $_POST['num1'];
$num2 = $_POST['num2'];
$num3 = $_POST['num3'];
$max = max($num1, $num2, $num3);
$min = min($num1, $num2, $num3);
echo "Maximum Number: ".$max ."<br>";
echo "Minimum Number: ".$min."<br>";
}
?>