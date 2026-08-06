package array;
import java.util.Scanner;
public class UpdatingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Total No. of Subjects: ");
        int size = input.nextInt();

        int marks[] = new int[size];
         for(int i=0; i<size; i++){
             marks[i] = input.nextInt();
         }

         marks = update(marks, size);

        System.out.println("Here are updated marks: ");
         for(int i = 0; i<size; i++) {
             System.out.print(marks[i]);
             System.out.println();
         }

    }

    public static int[] update(int[] marksOfSubjects,int n){
        for(int i = 0; i<n; i++){
            marksOfSubjects[i] = marksOfSubjects[i] + 5;
        }
        return marksOfSubjects;
    }

}
