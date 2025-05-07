<?php
$cookie_name=$_GET['name'];
setcookie($cookie_name, "", time()-300, "/");
header("Location: /cookielist.php");
?>