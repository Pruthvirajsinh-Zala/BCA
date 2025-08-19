<?php 
	public interface model {
		public $modelName;
		public function startEngine();
	}
	public class Car implements model {
		public $modelName="Swift";
		public function startEngine() {
			echo "Engine Started.<br>";
		}
	}
?>