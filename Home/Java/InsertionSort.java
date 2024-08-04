import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int[] x = new int[10];
        Scanner sc =new Scanner(System.in);

        for(int i=0;i<10;i++){
            System.out.println("Enter Value : ");
            x[i] = sc.nextInt();
        }
        for(int i=0;i<x.length;i++){
            int j=i-1;
            int temp=x[i];
            while(j>=0 && temp<x[j]){
                x[j+1] = x[j];
                j--;
            }
            x[j+1]=temp;
        }
        System.out.println("After Sorting...");
        for(int i=0;i<10;i++) {
            System.out.println(i + 1 + ":" + x[i]);
        }
    }
}
