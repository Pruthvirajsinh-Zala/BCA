import java.util.*;
class ArrEven {
	public static void main(String[] Args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);		
		for(int i=0;i<5;i++){
			System.out.print("Enter Number : ");
			arr[i] = sc.nextInt();
		if(arr[i]%2==0){
				break;
			}
		}
		
	}
}