import java.util.Scanner;

public class moveAllX {
    public static void moveAllX(String str, int idx, int count, String newString) {
        char currChar = str.charAt(idx);
        if(idx == str.length()) {
            for(int i=0;i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if(currChar == 'x') {
            count++;
            moveAllX(str,idx+1,count,newString);
        }else{
            newString += currChar;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String with x");
        String str = sc.next();
        moveAllX(str,0,0,"");
    }
}
