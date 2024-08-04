import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n==1 || n==0)
        {
            return 1;
        }
        int fact_nm1 = fact(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        int n,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value : ");
        n = sc.nextInt();
        f = fact(n);
        System.out.println("Factorial : "+ f);
    }
}
