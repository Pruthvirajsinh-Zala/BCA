<?php

class Logger {
    public function logMessage($msg) {
        echo $msg;
    }
}

$userLogger = new class extends Logger {
    public function logMessage($msg) {
        parent::logMessage("[USER] $msg");
    }
};

$errorLogger = new class extends Logger {
    public function logMessage($msg) {
        parent::logMessage("[ERROR] $msg");
    }
};

$userLogger->logMessage("User 'Jas G.' logged in.<br>");
$errorLogger->logMessage("Failed to connect to the database.<br>");

?>