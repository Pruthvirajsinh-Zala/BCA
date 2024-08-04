import java.util.Scanner;

public class BubbleSort{

    public static void main(String[] args) {
        int[] x = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Value "+ (i+1) + " ");
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i; j < x.length; j++) {
                if (x[j] < x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }

        }
        System.out.println("After Sorting...");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + ":" + x[i]);
        }
    }
}
