package backtracking;
import java.util.Scanner;
public class FindAllSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        String result = findingSubsetsOfString(str, " ", 0);

        System.out.println("Subsets of String: " + result);

    }

    public static String findingSubsetsOfString(String str, String ans, int i){
        //Base Case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.p
            }
            return ans + "\n";
        }
         //Include the current character
          String include = findingSubsetsOfString(str, ans+str.charAt(i), i+1);
         //Exclude the current character
          String exclude = findingSubsetsOfString(str, ans, i+1);

          return include + exclude;
    }
}
