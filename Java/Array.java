import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size =sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter Numbers...");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Printing Numbers....");
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println("Reversing Numbers...");
        for(int i = size-1; i>=0; i--){
            System.out.print(numbers[i]+" ");
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum = sum + numbers[i];
        }
        System.out.println();
        System.out.print("Total of All Numbers : " + sum);
    }
}
