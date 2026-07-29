package Patterns;
import java.util.Scanner;
public class MirroredHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int counter = (n-1);

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j>=counter){
                    System.out.print("* ");

                }else {
                    System.out.print("  ");
                }
            }
            counter--;
            System.out.println();
        }
    }
}



/*
Approach 2: Using j >= n - 1 - i (No counter)
    for (int i = 0; i < n; i++) {

        for (int j = 0; j < n; j++) {

        if (j >= n - 1 - i) {
        System.out.print("* ");
                } else {
                        System.out.print("  ");
                }

                        }

                        System.out.println();
        }

Approach 3: Two Loops (No if-else)
       for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        */