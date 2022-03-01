import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class Q1 {
        public static void main (String[] args) {
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            int y = input.nextInt();
            if (0 <= x && x <= 100 && 0 <= y && y <= 100){
                if( x % 2 == 0 && y % 2 == 0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }

        }
    }

