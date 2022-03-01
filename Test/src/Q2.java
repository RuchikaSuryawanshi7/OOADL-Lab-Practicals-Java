import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static char[] lexo_small(int n, int k)
    {
        String[] alpha = new String[] {"@","a", "b", "c", "d", "e", "f", "g", "h","i","j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        char arr[] = new char[n];
        if(k > 0){
            for (int i=0; i < n; i++){

            }

        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i=0; i < T; i++){
            int n= input.nextInt();
            int k = input.nextInt();
            char arr[] = lexo_small(n, k);
            System.out.print(new String(arr));
        }





    }
}
