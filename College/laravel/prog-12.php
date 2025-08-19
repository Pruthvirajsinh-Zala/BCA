<?php

abstract class Employee {
    protected $name;
    protected $id;

    public function __construct($name, $id) {
        $this->name = $name;
        $this->id = $id;
    }

    abstract public function calculateSalary();

    public function getDetails() {
        return "Employee Name: {$this->name}, ID: {$this->id}";
    }
}

class FullTimeEmployee extends Employee {
    private $monthlySalary;

    public function __construct($name, $id, $monthlySalary) {
        parent::__construct($name, $id);
        $this->monthlySalary = $monthlySalary;
    }

    public function calculateSalary() {
        return $this->monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private $hoursWorked;
    private $hourlyRate;

    public function __construct($name, $id, $hoursWorked, $hourlyRate) {
        parent::__construct($name, $id);
        $this->hoursWorked = $hoursWorked;
        $this->hourlyRate = $hourlyRate;
    }

    public function calculateSalary() {
        return $this->hoursWorked * $this->hourlyRate;
    }
}

$fullTime = new FullTimeEmployee("Alice", 101, 4000);
echo $fullTime->getDetails() . "\n";
echo "Salary: $" . $fullTime->calculateSalary() . "\n\n";

$partTime = new PartTimeEmployee("Bob", 202, 120, 15);
echo $partTime->getDetails() . "\n";
echo "Salary: $" . $partTime->calculateSalary() . "\n";

?>
