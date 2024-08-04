class swapwthopr {
	public static void main(String[] Args) {
		int a=10;
		int b=5;
		
		System.out.println("Value of a is "+ a);
		System.out.println("Value of b is "+ b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Value of a after swap is "+ a);
		System.out.println("Value of b after swap is "+ b);
	}
}