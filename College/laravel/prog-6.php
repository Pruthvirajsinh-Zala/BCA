<?php

class Book {
	public $title,$author,$year;
	public function setTitle($title){
		$this->title=$title;
		return $this;
	}
	public function setAuthor($author){
		$this->author=$author;
		return $this;
	}
	public function setYear($year){
		$this->year=$year;
		return $this;
	}
	public function getDetails(){
		echo "Title : ".$title."<br>";
		echo "Author : ".$author."<br>";
		echo "Year : ".$year."<br>";
	}
}

$obj=new Book();
$obj->getDetails().setTitle("Atomic Habits");
?>