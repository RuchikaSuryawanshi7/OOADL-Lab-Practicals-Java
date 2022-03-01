package i4.logic;

import java.util.ArrayList;

public class Yard {
    ArrayList<Train> yard = new ArrayList<>();

    //trainarrived, traindeparture, trainpresent, displaytrainsin yard, addtrain, removed
    public void addTrain(Train train){
        this.yard.add(train);
        System.out.println("Train with train no "+ train.TrainNo+" is arrived");
    }
    public void trainRemoved(Train train){
        this.yard.remove(train);
        System.out.println("Train with train no "+ train.TrainNo+" is departured");
    }
    public boolean trainStatus(Train train){
        if (yard.contains(train)){
            System.out.println("Train is in the Yard");
            return true;
        }else {
            System.out.println("Train is not in the Yard");
            return false;
        }
    }
    public void displayPresentTrain(){
        for(int i = 0; i < yard.size(); i++) {
        System.out.println(yard.get(i) .getTrainNo());
    }
    }

}
