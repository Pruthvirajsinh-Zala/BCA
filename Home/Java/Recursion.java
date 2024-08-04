import com.sun.jdi.CharValue;

import java.util.Scanner;

public class Recursion {

    public static int first = -1;
    public static int last=-1;
    public static void findOccurrence(String str,int idx,char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        findOccurrence(str,idx+1,element);
    }
    public static void TowerOfHanoi(int n,String src,String helper,String dest){
        if(n==1) {
            System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
            return;
        }
        TowerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
        TowerOfHanoi(n-1, helper, src, dest);
    }

    public static int fact(int n){
        if(n==1 || n==0)
        {
            return 1;
        }
        int fact_nm1 = fact(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }

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

    public static Boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            //Array is Sorted till Now
            return isSorted(arr,idx+1);
        }else{
            return false;
        }
    }

    public static void moveAllX(String str, int idx, int count, String newString7) {
        char currChar = str.charAt(idx);
        if(idx == str.length()) {
            for(int i=0;i<count;i++){
                newString7 += 'x';
            }
            System.out.println(newString7);
            return;
        }
        if(currChar == 'x') {
            count++;
            moveAllX(str,idx+1,count,newString7);
        }else{
            newString7 += currChar;
        }
    }

    public static Boolean[] map = new Boolean[26];

    public static void removeDuplicates(String str, int idx, String newString8){
        if(idx == str.length()){
            System.out.println(newString8);
            return;
        }

        char currChar = str.charAt(idx);

        if(map[currChar - 'a']){
            removeDuplicates(str, idx+1,newString8);
        }else{
            newString8 += currChar;
            map[currChar] = true;
            removeDuplicates(str, idx+1,newString8);
        }

    }

    public static void subsSequences(String str, int idx, String newString){
        char currChar = str.charAt(idx);
        if(currChar == str.length()){
            System.out.println(newString);
            return;
        }


        // to be
        subsSequences(str,idx+1,newString+currChar);

        //not to be
        subsSequences(str,idx+1,newString);
    }
    public static void main(String[] args){
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Factorial");
        System.out.println("2) Tower of Hanoi");
        System.out.println("3) Fibonacci");
        System.out.println("4) String Reverse");
        System.out.println("5) Find First and Last Occurrence ");
        System.out.println("6) Find if Array is Sorted");
        System.out.println("7) Move All X to the end");
        System.out.println("8) Remove Duplicate in String");
        System.out.println("9) Print all Subsequence of a String");
        System.out.println("Enter Your Choice");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                int n,f;
                System.out.println("Enter Value : ");
                n = sc.nextInt();
                f = fact(n);
                System.out.println("Factorial : "+ f);
                break;
            case 2:
                int i;
                System.out.println("Enter No. of Disks : ");
                i = sc.nextInt();
                TowerOfHanoi(i, "S", "H", "D");
                break;
            case 3:
                int a=0,b=1;
                System.out.println("Enter The No. of Digits : ");
                n = sc.nextInt();
                System.out.println(a);
                System.out.println(b);
                printFib(a,b,n-2);
                break;
            case 4:
                String str = sc.next();
                printRev(str,str.length()-1);
                break;
            case 5:
                System.out.println("Enter A String :");
                str = sc.next();
                System.out.println("Enter Element Fo search");
                String element = sc.next();
                findOccurrence(str,0,element.charAt(0));
                break;
            case 6:
                int arr[] = {1,2,3,4,5};
                System.out.println("Enter 5 Numbers");
                for(i=0;i<5;i++){
                    arr[i] = sc.nextInt();
                }
                System.out.println(isSorted(arr,0));
                break;
            case 7:
                System.out.println("Enter a String with x");
                str = sc.next();
                moveAllX(str,0,0,"");
                break;
            case 8:
                System.out.println("Enter a String With repeated Letters ");
                str = sc.next();
                removeDuplicates(str,0,"");
                break;
            case 9:
                System.out.println("Enter a String ");
                str = sc.next();
//                printSub sub = new printSub();
//                sub.str = "abc";
                subsSequences(str,0,"");

                break;
            default:
                System.out.println("Invalid Choice..");
        }
    }


}
