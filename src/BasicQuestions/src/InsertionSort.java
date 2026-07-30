import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of The Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your sorted Array: ");
        arr = insertion(arr, n);
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] insertion(int[] arr, int n){
      for(int i = 1; i<n; i++) {
          int key = arr[i];
          int j = i - 1;

          while((j>=0) && (arr[j]>key)){
              arr[j+1] = arr[j];
              j--;
          }
          arr[j+1]=key;
      }
      return arr;
    }
}
