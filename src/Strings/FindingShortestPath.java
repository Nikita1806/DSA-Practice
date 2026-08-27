package Strings;
import java.util.Scanner;
public class FindingShortestPath {
    public static float getShortestPath(String path){
        int x = 0;
        int y = 0;
        for(int i = 0; i<path.length(); i++){
            char direction = path.charAt(i);

            //North
            if(direction == 'N'){
                y++;
            }

            //South
            else if(direction == 'S'){
                y--;
            }

            //East
            else if(direction == 'E'){
                x++;
            }

            //West
            else{
                x--;
            }
        }

        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        String input;
        System.out.print("Enter Your Path String (E,W,S,N): ");           //Here R != r , it will treat Lower Case and Upper Case Differently.
        input = sc.nextLine();

        float result = getShortestPath(input);

        System.out.print("Shortest Distance: " + result);
    }
}
