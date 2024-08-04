import java.util.Scanner;

public class removeDuplicates {

    public static Boolean[] map = new Boolean[26];
    public static void removeDuplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        if(map[currChar - 'a']){
            removeDuplicates(str, idx+1,newString);
        }else{
            newString += currChar;
            map[currChar] = true;
            removeDuplicates(str, idx+1,newString);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String With repeated Letters ");
        String str = sc.next();
        String newString = "";
        removeDuplicates(str,0,newString);
    }
}
