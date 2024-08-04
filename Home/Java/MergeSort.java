import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        int[] x = new int[5];
        int[] y = new int[5];
        int[] z = new int[10];
        int j=0,k=0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <x.length; i++) {
            System.out.println("Enter Value "+ (i+1) + " ");
            x[i] = sc.nextInt();
        }
        for (int i = 0; i <y.length; i++) {
            System.out.println("Enter Value "+ (i+1) + " ");
            y[i] = sc.nextInt();
        }
        int i=0;
        while (k<10) {
            if(x[i] < y[j]){
                z[k++] = x[i++];
            }else if(x[i]>y[j]){
                z[k++] = y[i++];
            }else if(i < 5){
                z[k++] = x[i++];
            }else{
                z[k++] = y [j++];
            }
        }

        System.out.println("After Sorting...");
        for (i = 0; i <z.length; i++) {
            System.out.println(i + 1 + ":" + z[i]);
        }
    }
}
