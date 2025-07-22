<?php 
    class Product
    {

		public $name,$price,$quantity,$category;
        public function __construct($name,$price,$quantity,$category)
        {
            $this->name=$name;
			$this->price=$price;
			$this->quantity=$quantity;
			$this->category=$category;
        }
		public function getProductInfo()
		{
			
			echo "Product Name : ".$this->name."<br>";
			echo "Product price : ".$this->price."<br>";
			echo "Product quantity : ".$this->quantity."<br>";
			echo "Product category : ".$this->category."<br>";

			
		}
		public function updateQuantity($amount)
		{
			$this->quantity=$this->quantity+$amount;
		}
		public function isInStock()
		{
			if($this->quantity>0)
			{
				echo "In Stock.<br>";
			}
			else
			{
				echo "Not In Stock.<br>";
			}				
		}
		public function applyDiscount($percent)
		{
			$this->price=$this->price-($this->price*$percent)/100;
			echo "Discounted Price : ".$this->price."<br>";
		}
		
		public function restock($amount)
		{
			$this->quantity=$this->quantity+$amount;
			echo "Restocked.<br>";
		}

    }
    $obj=new Product("Soap",200,10,"A");
    $obj->getProductInfo();
	$obj->updateQuantity(20);
	$obj->isInStock();
	$obj->applyDiscount(20);
	$obj->restock(50);

?>