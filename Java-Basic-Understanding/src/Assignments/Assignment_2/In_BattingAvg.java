package Assignments.Assignment_2;
//In cricket, a player's batting average is the total number of runs they have scored divided
// by the number of times they have been out, usually given to two decimal places.
public class In_BattingAvg {
    public static void main(String[] args) {
        int run = 100;
        int noOut = 1;
        int noMatches = 1;
        int out = noMatches - noOut;
        if( out< 1){
            System.out.println("NA");
        }else {
            float avg = run / out;
            System.out.println("Batting average is " + avg);
        }
    }
}
