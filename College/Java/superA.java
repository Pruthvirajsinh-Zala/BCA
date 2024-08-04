class A {
	int a=10;
}
class B extends A{
	int a=20;
	void show(){
		System.out.println("Base Class A : "+super.a);
		System.out.println("Derived Class A : "+a);
	}
}
class superA {
	public static void main(String[] Args) {
		B obj = new B();
		obj.show();
	}
}