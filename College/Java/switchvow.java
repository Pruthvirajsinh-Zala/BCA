import java.util.*;
import java.lang.String;
class switchvow {
	public static void main(String[] Args) {
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		a = sc.next();
		switch(a.charAt(0)) {
			case 'a': case 'e' : case 'i' : case 'o': case 'u' :
			case 'A': case 'E' : case 'I' : case 'O': case 'U' :
			System.out.println("Vowel");
			break;
			
			default :
			System.out.println("Not a Vowel");
		}
	}
}