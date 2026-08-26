package Strings;
import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print("Please Enter Your Name: ");
        name = sc.next();   //It takes input till first space only
        sc.nextLine();
        System.out.println(name);

        String fullName;
        System.out.print("Please Enter Your Full Name: ");
        fullName = sc.nextLine();    //It takes input with Spaces
        System.out.println(fullName);
        System.out.println(fullName.length());    //Length Function


    }
}
