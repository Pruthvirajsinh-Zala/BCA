import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name :");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Length = "+name.length());
        System.out.println("Individual Character ....");
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
        System.out.println("Enter Another Name : ");
        String name2 = sc.nextLine();
        if(name.compareTo(name2) == 0){
            System.out.println("Names are Same...");
        }else{
            System.out.println("Names are Different...");
        }

    }
}
