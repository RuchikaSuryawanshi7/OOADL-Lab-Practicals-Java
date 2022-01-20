import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String to check whether is Palidrome or not!!");
        String s = input.next();
        String sRev = "";
        for(int i=s.length()-1; i>=0; --i){
            sRev = sRev+s.charAt(i);
        }
        System.out.println(sRev);
        if(s.equals(sRev)){
            System.out.println(s+" is a Palindrome String");
        }else {
            System.out.println("Not Palindrome String");
        }
    }
}
//    String original, reverse = ""; // Objects of String class
//    Scanner in = new Scanner(System.in);
//        System.out.println("Enter a string/number to check if it is a palindrome");
//                original = in.nextLine();
//                int length = original.length();
//                for ( int i = length - 1; i >= 0; i-- )
//                reverse = reverse + original.charAt(i);
//                if (original.equals(reverse))
//                System.out.println(" string/number is a palindrome.");
//                else
//                System.out.println("string/number isn't a palindrome.");
//                }