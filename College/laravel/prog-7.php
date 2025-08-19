<?php 
class Vehicle {
	
public $brand,$model;
public function vehicleDetails {
	echo "Brand : ".$this->brand."<br>";
	echo "Model : ".$this->model."<br>";

}
class Car implements Vehicle {
	public $fuelType;
	public function __initialize() {
		
	}
	public function vehicleDetails {
		echo "Brand : ".$this->brand."<br>";
		echo "Model : ".$this->model."<br>";
		echo "Fuel Type : ".$this->fuelType."<br>";
	}
}
$obj=new Car();
$obj->brand="Maruti";
$obj->model="swift";
$obj->fuelType="Petrol";
$obj->vehicleDetails();
?>