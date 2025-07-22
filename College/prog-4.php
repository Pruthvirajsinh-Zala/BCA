<?php

	class Calculator 
	{
		public static $pi=3.14;
		public static function circleArea($radius)
		{
			return self::$pi*$radius*$radius;
		}
		public static function circleCircumference($radius)
		{
			return self::$pi*$radius*2;
		}
	}
	
	$obj = new Calculator();
	echo "Circle Area : ".$obj->circleArea(20)."<br>";
	echo "Circle Circumference : ".$obj->circleCircumference(20)."<br>";
?>