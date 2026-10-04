package Recursion;
import java.util.Scanner;
public class BinaryStringProblem {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of String: ");
        int n = sc.nextInt();

        printBinaryString(n, 0, " ");
    }

    public static void printBinaryString(int n, int lastPlace, String str){
        if(n == 0){                     //Base Case
            System.out.println(str);
            return;
        }

        //Kaam
        printBinaryString(n-1, 0, str+"0");

        if(lastPlace == 0){
            printBinaryString(n-1, 1, str+"1");
        }
    }

}
