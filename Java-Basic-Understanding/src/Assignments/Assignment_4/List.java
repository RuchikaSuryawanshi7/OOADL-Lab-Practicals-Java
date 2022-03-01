package Assignments.Assignment_4;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        //Adding Element in an Arraylist
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        //Printing All elements in an arraylist
//        System.out.println(list);
//        //get element
//        System.out.println(list.get(0));
//        System.out.println(list.contains(5));

        // Creating Array list of ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println("Enter no of arraylist you want create inside Arraylist");
        int siz = input.nextInt();
        for (int i=0; i<siz; i++){
            list.add(new ArrayList<>());
        }
        for (int j=0; j< list.size(); j++){
            System.out.println("Enter Elements in arraylist");
            for (int k=0; k<3; k++){
                list.get(j).add(input.nextInt());
            }
        }
        System.out.println(list);
    }

}
