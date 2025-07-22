<?php 
    class Student
    {

		public $name,$rollno,$grade,$total,$mark1,$mark2,$mark3,$percentage;
        public function __construct($name,$rollno,$mark1,$mark2,$mark3)
        {
            $this->name=$name;
			$this->rollno=$rollno;
			$this->mark1=$mark1;
			$this->mark2=$mark2;
			$this->mark3=$mark3; 
        }
		public function getDetails()
		{
			$this->total=$this->mark1+$this->mark2+$this->mark3;
			$this->percentage=$this->total/3;
			if($this->percentage>80)
			{
				$this->grade="A";
			}
			elseif($this->percentage>70)
			{
				$this->grade="B";
			}
			elseif($this->percentage>60)
			{
				$this->grade="C";
			}
			elseif($this->percentage>40)
			{
				$this->grade="D";
			}
			else
			{
				$this->grade="Fail";
			}
			echo "Name : ".$this->name."<br>";
			echo "Roll No. : ".$this->rollno."<br>";
			echo "Total : ".$this->total."<br>";
			echo "Percentage : ".$this->percentage."<br>";
			echo "Grade : ".$this->grade."<br>";
		}
		public function checkResult()
		{
			if($this->percentage>40)
			{
				echo "Result : Pass";
			}
			else
			{
				echo "Result : Fail";
			}
		}

    }
    $obj=new Student("Kunal",41,50,80,90);
    $obj->getDetails();
	$obj->checkResult();

?>