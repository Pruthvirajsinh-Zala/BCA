<?php 
	class Course {
		protected $courseName;
		public function getCourseDetails() {
			echo "Course Price : $200"."<br>";
			echo "Course Mode : Offline"."<br>";
		} 		
	}
	class OnlineCourse  extends Course{
		public function getCourseDetails() {
			echo "Course Price : $150"."<br>";
			echo "Course Mode : Online"."<br>";
		}
		public function displayCourseName() {
			$this->courseName="Java";
			echo "Course Name : ".$this->courseName."<br>";
		}
	}

	$course=new Course();
	$course->getCourseDetails();
	$ocourse=new OnlineCourse();
	$ocourse->getCourseDetails();
	$ocourse->displayCourseName();
?>