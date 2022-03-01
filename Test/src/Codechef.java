/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
    public static boolean isPresent(String[] dname, String s){
        for (String element : dname) {
            if (element == s) {
                return true;
            }
        }
        return false;
    }
    public static void Check(String name[]){
//        d = {}
//        for x in l:
//        if x in d:
//        d[x] += 1
//        else:
//        d[x] = 1
//        for x in d:
//        if d[x] >= s:
//        print(x)
//        break
//    else:
//        print(-1)
//        t -= 1
        String[] count = new String[name.length];
        for(int i=0; i<name.length; i++){
            if(isPresent(count,name[i])){
                count[i] += 1;
            }else {
                count[i] = String.valueOf(1);
            }

        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while(T != 0){
            int N = input.nextInt();
            String[] Name = new String[N];
            for(int i=0; i<N; i++){
                Name[i]=input.nextLine();
            }

            T--;
        }


    }
}
