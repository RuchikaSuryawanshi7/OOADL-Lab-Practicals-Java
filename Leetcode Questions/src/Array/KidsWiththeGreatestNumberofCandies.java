//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
//
//    //Solution using normal Array
//    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
//        boolean[] results = new boolean[candies.length];
//        int size = candies.length;
//        int candyFinal;
//        for(int i=0; i<size; i++){
//            candyFinal = candies[i] + extraCandies;
//            if((check(candyFinal,candies,candies[i])) == false){
//                results[i] = false;
//            }else{
//                results[i] = true;
//            }
//            //System.out.println(Arrays.toString(results));
//            candyFinal = 0;
//        }
//
//        return results;
//    }
//    public static boolean check(int candyFinal, int[] candies, int candy){
//        boolean checkTF = false;
//        for(int i=0; i<candies.length; i++){
//            //System.out.println(candies[i]+" fhfj "+candyFinal+" "+ candy);
//            if(candies[i] == candy){
//                continue;
//            }
//            System.out.println("canfyfinal: "+ candyFinal+ " and current candy "+ candies[i]);
//            if(candyFinal < candies[i]){
//                checkTF = true;
//                break;
//            }
//        }
//        System.out.println("checktf is "+ checkTF);
//        return checkTF;
//    }

    //Solution using Arraylist
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> results = new ArrayList<>(candies.length);
        //boolean[] results = new boolean[candies.length];
        int size = candies.length;
        int candyFinal;
        for(int i=0; i<size; i++){
            candyFinal = candies[i] + extraCandies;
            if(check(candyFinal,candies,candies[i])){
                results.add(i,true);
            }else{
                results.add(i,false);
            }
            //System.out.println(results);
            candyFinal = 0;
        }

        return results;
    }
    public static boolean check(int candyFinal, int[] candies, int candy){
        boolean checkTF = true;
        for(int i=0; i<candies.length; i++){
            if(candyFinal < candies[i]){
                checkTF = false;
                break;
            }
        }
        return checkTF;
    }
    public static void main(String[] args) {
        System.out.println("hello");
        int[] ar = {2,3,5,1,3};
        //int[] ar = {2,3,5,1,1,3};
        kidsWithCandies(ar,3);
    }





}