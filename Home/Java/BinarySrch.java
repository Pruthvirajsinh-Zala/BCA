import java.util.Scanner;

public class BinarySrch {
    public static void main(String[] args) {
        int[] x = new int[10];
        int first,last,sv,flag=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<x.length;i++){
            System.out.println("Enter Value "+ (i+1) +":");
            x[i] = sc.nextInt();
        }
        first = x[0];
        last=x[9];
        int mid = first + last / 2;
        System.out.println("Enter Value for Serch :");
        sv = sc.nextInt();
        while(flag==0 && first<last){
            if(sv == x[mid]){
                flag=1;
                System.out.println("Value found at Position : " + (mid+1));
            }
            else if(sv < x[mid]){
                last = mid-1;
            }
            else{
                first = mid+1;
            }
            mid = (first + last) / 2;
        }
        if(flag==0){
            System.out.println("Value Not Found...");
        }
    }
}
