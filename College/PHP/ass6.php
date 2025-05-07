<html>
<body>
<form method="POST">
    <label for="num1">Enter First Number: </label>
    <input type="number" name="num1" id="num1" required><br><br>
    <label for="num2">Enter Second Number: </label>
    <input type="number" name="num2" id="num2" required><br><br>
    <input type="submit" name="add" value="Add">
    <input type="submit" name="sub" value="Subtract">
    <input type="submit" name="mul" value="Multiply">
    <input type="submit" name="div" value="Divide"><br><br>
</form>
<?php
$num1 = $_POST['num1'];
$num2 = $_POST['num2'];
if (isset($_POST['add'])) {
    $result = $num1 + $num2;
    echo "Result: $num1 + $num2 = $result";
} elseif (isset($_POST['sub'])) {
    $result = $num1 - $num2;
    echo "Result: $num1 - $num2 = $result";
} elseif (isset($_POST['mul'])) {
    $result = $num1 * $num2;
    echo "Result: $num1 * $num2 = $result";
} elseif (isset($_POST['div'])) {
    if ($num2 != 0) {
        $result = $num1 / $num2;
        echo "Result: $num1 ÷ $num2 = $result";
    } else {
        echo "Error: Division by zero is not allowed.";
    }
} 
?>
</body>
</html>
