import java.util.Scanner;

public class printReverse {

    public static void printRev(String str,int idx)
    {
        if(idx==0)
        {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str,idx-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String ");
        String str = sc.next();
        printRev(str,str.length()-1);
    }
}
