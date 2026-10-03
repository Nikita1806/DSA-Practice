package Recursion;
import java.util.Scanner;
public class PairingFriends {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of Friends: ");
        int n = sc.nextInt();

        int waysToPairFriends = pairingFriends(n);
        System.out.println("The number of ways to pair the Friends: " + waysToPairFriends);

    }

    public static int pairingFriends(int n){
        if(n == 1 || n == 2){
            return n;
        }

        return pairingFriends(n-1) + (n-1)*pairingFriends(n-2);
    }
}
