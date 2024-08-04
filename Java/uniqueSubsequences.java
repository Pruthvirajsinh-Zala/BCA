public class uniqueSubsequences {
    public static void uniqueSubsequences(String str, int idx, String newString) {
        char currChar = str.charAt(idx);
        if (currChar == str.length()) {
            System.out.println(newString);
            return;
        }
    }

    public static void main(String[] args) {

    }
}
