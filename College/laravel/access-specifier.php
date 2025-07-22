<?php 
    class parentClass
    {
        public $a=10;
        private $b=20;
        public function getValue()
        {
            echo $this->a;
            echo $this->b;   
        }

    }
    $obj=new parentClass();
    $obj->getValue();

?>