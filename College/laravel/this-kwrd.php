<?php
	class parentClass
	{
		public $a=10;
		public $b=20;
		public function add()
		{
			echo $this->a+$this->b;
		}
	}
	$obj=new parentClass();
	$obj->add();
?>