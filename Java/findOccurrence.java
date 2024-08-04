import java.util.Scanner;

public class findOccurrence {
    public static int first = -1;
    public static int last=-1;
    public static void findOccurrence(String str,int idx,char element){
        if(idx == str.length()){
            System.out.println("First Occurrence : " + first);
            System.out.println("Last Occurrence : " + last);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String :");
        String str = sc.next();
        System.out.println("Enter Element Fo search");
        String element = sc.next();
        findOccurrence(str,0,element.charAt(0));
    }
}
