package Strings;
import java.util.Scanner;
//import java.lang.String;
public class ConvertToUppercase {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter your String: ");
       String str = sc.nextLine();

       StringBuilder result = convertFirstLetterToUpperCase(str);
        System.out.println("Required String: " + result);
    }

    public static StringBuilder convertFirstLetterToUpperCase(String str){
        StringBuilder sb  = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i-1) == ' '){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb;
    }

}
