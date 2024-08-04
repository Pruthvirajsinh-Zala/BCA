import java.util.*;
class ArrSum {
	public static void main(String[] Args) {
		int no[] = new int[10];
		int sum=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<no.length;i++) {
			System.out.println("Enter Value "+(i+1));
			no[i] = sc.nextInt();
			sum = sum+no[i];
		}
		System.out.println("Sum = "+sum);
	}
}