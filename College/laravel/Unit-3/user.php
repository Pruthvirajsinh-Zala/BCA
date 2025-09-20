<?php

class UserProfile {
    public string $username;
    public string $email;
}

$user1_clone_test = new UserProfile();
$user1_clone_test->username = "jane_doe";
$user1_clone_test->email = "jane@example.com";

$user2_clone_test = clone $user1_clone_test;

$user2_clone_test->email = "jane.doe.new@example.com";

echo "User 1's email (original): " . $user1_clone_test->email . "<br>";
echo "User 2's email (cloned): " . $user2_clone_test->email . "<br>";

?>