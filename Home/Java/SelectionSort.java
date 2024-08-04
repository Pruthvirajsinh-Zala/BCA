import java.util.Scanner;

public class SelectionSort{
    public static void main(String[] args) {
        int[] x = new int[10];
        Scanner sc =new Scanner(System.in);

        for(int i=0;i<10;i++){
            System.out.println("Enter Value : ");
            x[i] = sc.nextInt();
        }
        for(int i=0;i<x.length-1;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i] > x[j]){
                    int temp = x[i];
                    x[i] =x[j];
                    x[j] = temp;
                }
            }

        }
        System.out.println("After Sorting...");
        for(int i=0;i<10;i++) {
            System.out.println(i + 1 + ":" + x[i]);
        }
    }
}