package array;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Linear Search:) ");
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element at " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Element you want to search: ");
        int num = sc.nextInt();

        boolean found = linearSearching(n, arr, num);
        if (!found) {
            System.out.println("The element you are searching is not present in given Array.");
        }
    }

    public static boolean linearSearching(int size, int[] array, int toFind){
        for(int i = 0; i< size; i++){
            if(array[i] == toFind){
                System.out.println("The element you are searching is at " + i );
                return true;
            }

        }
        return false;
    }
}
