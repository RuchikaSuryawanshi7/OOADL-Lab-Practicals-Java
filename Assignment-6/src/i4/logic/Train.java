package i4.logic;

import java.util.ArrayList;

public class Train {
    String TrainNo;

    public Train(String trainNo) {
        TrainNo = trainNo;
    }

    public String getTrainNo() {
        return TrainNo;
    }

    public void Display(ArrayList arr, int no){
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        //System.out.println("Train No is: "+ this.TrainNo);
    }
}
