package i4.client;

import i4.logic.Bill;
import i4.logic.Line;

public class Test {
    public static void main(String[] args) {
        Bill bill = new Bill(112);
        Line line = new Line("homemini",1223, 5);
        Line line1 = new Line("mini",1200, 2);
        bill.addBillItem(line);
        bill.addBillItem(line1);
        bill.grandTotal();
        bill.Display();
    }
}
