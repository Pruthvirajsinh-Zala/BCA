class swapwtv {
	public static void main(String[] Args) {
		int a=10;
		int b=5;
		int c;
		
		System.out.println("Value of a is "+ a);
		System.out.println("Value of b is "+ b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("Value of a after swap is "+ a);
		System.out.println("Value of b after swap is "+ b);
	}
}