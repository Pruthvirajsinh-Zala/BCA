<?php 
class Bank
{
	public $name;
	function Banknm()
	{
		$this->name="ICICI";
	}
}
class Dept extends Bank
{
	public $deptnm;
	function Depntnm($name)
	{
		$this->deptnm=$name;
	}
}
class Emp extends Dept
{
	public $Empnm;
	function empnm($nm)
	{
		$this->empnm=$nm;
	}
	function showDetails()
	{
		echo "Bank Name : ".$this->name."<br>";
		echo "Departmant Name : ".$this->deptnm."<br>";
		echo "Employee Name : ".$this->empnm."<br>";
	}
}
$obj= new Emp();
$obj->Banknm();
$obj->Depntnm("Accounts");
$obj->Empnm("Kunal");
$obj->showDetails();
?>