package i4.logic;

import java.util.ArrayList;

public class Bill {
    int billNo;
    int grandTotal;
    ArrayList PurchasedItem = new ArrayList<>();

    public Bill(int billNo) {
        this.billNo = billNo;
    }
    public void addBillItem(Line line){
        this.PurchasedItem.add(line);
        grandTotal += line.calSubTotal();
        System.out.println("Item added Successfully!!");

    }
    public void grandTotal(){
        System.out.println("Your Grand Total is: "+ this.grandTotal);
    }
    public void Display(){
        System.out.println("Bill no is: "+ this.billNo);
        System.out.println("Bill total is: "+ this.grandTotal);
    }
}
