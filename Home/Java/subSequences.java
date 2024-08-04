import java.util.Scanner;

public class subSequences {

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

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String ");
        String str = "abcd";
        subsSequences(str,0,"");
    }
}
