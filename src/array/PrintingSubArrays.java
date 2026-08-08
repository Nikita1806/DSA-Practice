package array;
import java.util.Scanner;
public class PrintingSubArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();


        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int count = 1;
                if(j!=0) {
                    System.out.print("{" + arr[i] + " ");
                }else{
                    System.out.print("{" + arr[i] );
                }

                for (int k = 0; k < j; k++) {
                    if (k != (j - 1)) {
                        System.out.print(arr[i + count] + " ");
                        count++;
                    } else {
                        System.out.print(arr[i + count]);
                    }
                }
                System.out.print("} ");
            }
            System.out.println();
        }
    }
}




