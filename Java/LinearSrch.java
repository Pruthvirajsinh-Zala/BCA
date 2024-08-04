import java.util.Scanner;

public class LinearSrch {
    public static  void main(String[] args){
        int[] x = new int[10];
        int sv,flag = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<x.length;i++){
            System.out.println("Enter Value "+(i+1)+":");
            x[i] = sc.nextInt();
        }
        System.out.println("Enter Value for Search :");
        sv = sc.nextInt();
        for(int i=0;i<x.length;i++){
            if(sv == x[i]){
                flag=1;
                System.out.println("Value Fount at Position :"+ (i+1));
            }
            
        }
        if(flag==0){
            System.out.println("Value Not Found");
        }
    }
}
