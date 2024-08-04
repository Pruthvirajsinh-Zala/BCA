/*write a java program which create tringle with 2 variable base and hight with float and double.take two constructor of triangle class 1)takes default value and 2)take value as parameter after that create a methon calculate area() to calculate area of triangle define main methon and create object to the class and print area of triangle*/

class triangle {
	double base,height;
	triangle(){
		base=10;
		height=12;
	}
	triangle(double b,double h){
		base = b;
		height = h;
	}
	void calcarea(){
		double ans;
		ans = 0.5*base*height;
		System.out.println("Area of Triangle : "+ans);
	}
}

class trianglearea {
	public static void main(String[] Args){
		triangle t1 = new triangle();
		triangle t2 = new triangle(15,21);
		t1.calcarea();
		t2.calcarea();
	}
}