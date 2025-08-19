<?php 
	class Employee {
		public $name,$salary;
		public function display() {
			echo "Name : ".$this->name."<br>";
			echo "Salary : ".$this->salary."<br>";
		} 		
	}
	class Manager extends Employee{
		public $department;	
		public function displayManager() {
			echo "Name : ".$this->name."<br>";
			echo "Salary : ".$this->salary."<br>";
			echo "Department : ".$this->department."<br>";
		}
	}
	class Developer extends Employee{
		public $programmingLanguage;
		public function displayDeveloper() {
			echo "Name : ".$this->name."<br>";
			echo "Salary : ".$this->salary."<br>";
			echo "Programming Language : ".$this->programmingLanguage."<br>";
		}
	}
	$man=new Manager();
	$man->name="Kunal";
	$man->salary="20k";
	$man->department="CSIT";
	$man->displayManager();
	$dev=new Developer();
	$dev->name="Karun";
	$dev->salary="21k";
	$dev->programmingLanguage="Python";
	$dev->displayDeveloper();
?>