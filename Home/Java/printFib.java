import java.util.Scanner;

public class printFib {
    public static void printFib(int a, int b, int n)
    {
        if(n==0)
        {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b,c,n-1);
    }

    public static void main(String[] args) {
        int a=0,b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No. of Digits : ");
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        printFib(a,b,n-2);
    }
}
