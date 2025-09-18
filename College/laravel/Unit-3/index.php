<?php

// Define the autoloader function
spl_autoload_register(function ($className) {
    $file = __DIR__ . '/classes/' . $className . '.php';
    if (file_exists($file)) {
        require $file;
    }
});

// Instantiate objects of the classes
$post = new Post();
$author = new Author();
$category = new Category();

?>