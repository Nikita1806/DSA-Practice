package Recursion;
import java.util.Scanner;
public class PrintDecreasing {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the Number: ");
         int n = sc.nextInt();

         printDecreasingNo(n);

    }

    public static void printDecreasingNo(int n){
        if(n == 1){                                //Defining Base Case
            System.out.print(n);
            return;
        }

         System.out.print(n + " ");                //The KAAM
         printDecreasingNo(n-1);                 //Function Calling Itself
    }
}
