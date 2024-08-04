class Shape {
	void Draw(){
		System.out.println("No Shape.");
	}
}
class Circle extends Shape {
	void Draw(){
		System.out.println("Draw Circle.");
	}
}
class Rectangle extends Shape {
	void Draw(){
		System.out.println("Draw Rectangle.");
	}
}
class DynamicDisp {
	public static void main(String[] Args){
		Shape s1;
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		
		s1 = c1;
		s1.Draw();
	}
}