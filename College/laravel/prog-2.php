<?php 
    class Bank
    {

		public $accountNumber,$accountHolder;
		public $balance=0;
        public function __construct($accountNumber,$accountHolder,$balance)
        {
            $this->accountNumber=$accountNumber;
			$this->accountHolder=$accountHolder;
			$this->balance=$balance;
        }
		public function deposit($amount)
		{
			if($amount>0)
			{
				$this->balance=$this->balance+$amount;
				echo "Deposited : ".$amount."<br>";
			}
		}
		public function withdraw($amount)
		{
			if($this->balance>$amount)
			{
				$this->balance=$this->balance-$amount;
				echo "Withdrawn : ".$amount."<br>";
			}
		}
		public function getBalance()
		{
			echo "Balance : ".$this->balance."<br>";	
		}
		public function getAccountInfo()
		{
			echo "Account No : ".$this->accountNumber."<br>";
			echo "Account Holder : ".$this->accountHolder."<br>";
			echo "Balance : ".$this->balance."<br>";
		}
		

    }
    $obj=new Bank(123,"Kunal",50000);
    $obj->deposit(10000);
	$obj->withdraw(20000);
	$obj->getBalance();
	$obj->getAccountInfo();

?>