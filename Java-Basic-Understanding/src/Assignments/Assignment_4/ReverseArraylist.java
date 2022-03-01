package Assignments.Assignment_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ReverseArraylist {
    static void rev(ArrayList<Integer> l,  int i, int e){
        //System.out.println("tyfgyhujiko");
        while (i < e){
            //System.out.println(l.get(e));
            int start = l.get(i);
            int end = l.get(e);
            l.set(i, end);
            l.set(e,start);
            i++;
            e--;
        }
        System.out.println(l);

    }
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        rev(list,0, 3);


    }
}
