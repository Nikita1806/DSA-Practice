package array;
import java.util.Scanner;
public class MenuByLinearSearch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("TODAY'S MENU: ");
            int n = 8;

            String[] menu = new String[n];
            menu[0] = "Veg McMuffin with protein plus";
            menu[1] = "Chicken Sausage McMuffin with Egg with protein plus";
            menu[2] = "Veg McMuffin + Hashbrown";
            menu[3] = "McAloo Tikki Burger";
            menu[4] = "Hashbrown";
            menu[5] = "Cold Coffee";
            menu[6] = "Veg McMuffin - Sandwich";
            menu[7] = "4 Pc McSpicy Chicken Wings";

            for (int i = 0; i < n; i++) {
                System.out.println(i+1 + ". " + menu[i]);
            }

            System.out.print("Enter the serial number of item you want to have: ");
            int item = sc.nextInt();


            boolean found = linearSearching(n, menu, item);
            if (!found) {
                System.out.println("The Item you are searching is Not in the menu. ");
            }
        }

        public static boolean linearSearching(int n, String[] menu, int item){
            for(int i = 0; i< n; i++){
                if(i == (item - 1)){
                    System.out.println("Your Ordered item is " + menu[i]);
                    return true;
                }
            }
            return false;
        }
}

