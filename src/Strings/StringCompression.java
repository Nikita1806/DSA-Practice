package Strings;
import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String str = sc.nextLine();

        StringBuilder finalString = compressTheString(str);
        System.out.print("Required compressed String is " + finalString);

    }

    public static StringBuilder compressTheString(String str){
        StringBuilder newStr = new StringBuilder("");

        for(int i = 0; i<str.length(); i++){
            Integer count = 1;
            while((i+1) < str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }

            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count.toString());
            }
        }
        return newStr;
    }
}
