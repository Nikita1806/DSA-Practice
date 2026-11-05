package backtracking;
import java.util.Scanner;
public class GridWays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the valur of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the valur of m: ");
        int m = sc.nextInt();

        int noOfWays = gridways(0, 0, n, m);
        System.out.print("Total no. of ways: " + noOfWays);
    }

    public static int gridways(int i, int j, int n, int m){
        //Base Case
        if(i == n-1 && j == m-1){
            return 1;
        }else if(i == n || j == n){
            return 0;
        }
        int w1 = gridways(i+1, j, n, m);
        int w2 = gridways(i, j+1, n, m);
        return w1 + w2;
    }

}
