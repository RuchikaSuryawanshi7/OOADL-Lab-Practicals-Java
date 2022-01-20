package Assignments.Assignment_2;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;

//Java Program Vowel Or Consonant
public class In_VowelCons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char s = input.next().charAt(0);
        char c = toLowerCase(s);
        if(c == 'a' && c == 'e' && c == 'i' && c == 'o' && c == 'u'){
            System.out.println("enter character is Vowel");
        }else {
            System.out.println("Entered Character is Consonent");
        }
    }
}
