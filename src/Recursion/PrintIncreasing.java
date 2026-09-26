package Recursion;
import java.util.Scanner;
public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        printIncreasingNo(n);
    }

    public static void printIncreasingNo (int n){
        //base Case
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printIncreasingNo(n-1);
        System.out.print(n + " ");

    }
}
