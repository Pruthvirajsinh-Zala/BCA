<?php
$a = 10;
$b = 5;
$add = $a + $b;
$sub = $a - $b;
$mul = $a * $b;
$div = $a / $b;
?>
<html>
<body>
<table border="1">
    <tr>
        <th>Operations</th>
        <th>Answers</th>
    </tr>
    <tr>
        <td>Value of A:</td>
        <td><?php echo $a; ?></td>
    </tr>
    <tr>
        <td>Value of B:</td>
        <td><?php echo $b; ?></td>
    </tr>
    <tr>
        <td>Addition of A and B:</td>
        <td><?php echo $add; ?></td>
    </tr>
    <tr>
        <td>Subtraction of A and B:</td>
        <td><?php echo $sub; ?></td>
    </tr>
    <tr>
        <td>Multiplication of A and B:</td>
        <td><?php echo $mul; ?></td>
    </tr>
    <tr>
        <td>Division of A and B:</td>
        <td><?php echo $div; ?></td>
    </tr>
</table>
</body>
</html>
