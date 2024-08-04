import java.util.*;
class ExitEvem {
	public static void main(String[] Args) {
		int[] ar = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<ar.length;i++) {
			System.out.print("Enter Value "+(i+1)+" : ");
			ar[i] = sc.nextInt();
			if(ar[i]%2==0){
					break;
				}
		}
	}
}