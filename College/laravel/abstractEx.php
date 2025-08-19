<?php

	abstract class upi {
		abstract function pay($amt);
	}
	class paytm extends upi{
		public function pay($amt){
			echo "paytm of $".$amt." successfull.";
		}
	}
	$obj=new paytm();
	$obj->pay(500);
?>