package i4.client;

import i4.logic.Train;
import i4.logic.Yard;

public class Test {
    public static void main(String[] args) {
        Train train1 = new Train("CDTdt1");
        Train train2 = new Train("dtryw1");
        Train train3 = new Train("GUIW81");
        Train train4 = new Train("7NKJ1");
        Train train5 = new Train("CDTQYt1");
        Train train6 = new Train("AADTdt1");
        Yard yard = new Yard();
        yard.addTrain(train1);
        yard.addTrain(train2);
        yard.addTrain(train3);
        yard.addTrain(train4);
        yard.trainStatus(train1);
        yard.displayPresentTrain();

    }
}
