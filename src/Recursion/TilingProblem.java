package Recursion;
import java.util.Scanner;
public class TilingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int waysToPutTiles = tilingProblem(n);
        System.out.println("The number of ways to put tiles in 1X" + n + " space is " +waysToPutTiles);

    }

    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;                 //as for n==0 is also a way of NOT ABLE TO PUT ANY TILE
        }

        return tilingProblem(n-1) + tilingProblem(n-2);
    }
}
