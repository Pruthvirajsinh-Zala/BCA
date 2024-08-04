import java.util.*;
class scanner {
	public static void main(String[] Args) {
		int x;
		float y;
		String z;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Int : ");
		x = sc.nextInt();		
		System.out.println("The Number is : "+x);
		System.out.print("Enter Float : ");
		y = sc.nextFloat();
		System.out.println("The Float is : "+y);
		System.out.print("Enter String : ");
		z = sc.next();
		System.out.println("The String is : "+z);
	}
}