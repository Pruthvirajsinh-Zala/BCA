<?php
interface Shape{
	public function calculateArea();
	public function calculatePerimeter();
}
class Rectangle implements Shape{
	
	public function calculateArea(width,height){
		return width*height;
	}
	public function calculatePerimeter(width,height){
		return 2*width*height;
	}
}
class Circle implements Shape{
	public function calculateArea(radius){
		return pi()*(radius*radius);
	}
	public function calculatePerimeter(radius){
		return 2*pi()*radius;
	}
}
$rect = new Rectangle();
echo "Rectangle Area: ".$rect->calculateArea(5,10);
echo "Rectangle Perimeter: ".$rect->calculatePerimeter(5,10);

$circle=new Circle();
echo "Circle Area: ".$circle->calculateArea(7);
echo "Circle Perimeter: ".$circle->calculatePerimeter(7);

?>