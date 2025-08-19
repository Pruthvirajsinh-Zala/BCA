<?php 
	class Person  {
		public $name,$age;
		public function display() {
			echo "Name : ".$this->name."<br>";
			echo "Age : ".$this->age."<br>";
		} 		
	}
	class Employee extends Person{
		public $employeeId;	
		public function displayEmployee() {
			echo "Employee ID : ".$this->employeeId."<br>";
			
		}
	}
	class TeamLeader extends Employee{
		public $teamSize;
		public function displayTeamLeader() {
			echo "Team Size : ".$this->teamSize."<br>";
		}
	}
	$teamlead = new TeamLeader();
	$teamlead->name="Jas";
	$teamlead->age=20;
	$teamlead->employeeId=1;
	$teamlead->teamSize=10;
	$teamlead->display();
	$teamlead->displayEmployee();
	$teamlead->displayTeamLeader();
?>