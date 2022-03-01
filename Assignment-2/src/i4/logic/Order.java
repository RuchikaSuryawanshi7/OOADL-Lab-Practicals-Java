package i4.logic;

import java.util.ArrayList;

public class Order {
    String orderNo;
    ArrayList<Item> itemList = new ArrayList<>();
    int totalPrice;

    public Order(String orderNo) {
        this.orderNo = orderNo;
    }

    public void addItem(Item item){
        this.itemList.add(item);
        this.totalPrice += item.calculateSubtotal();
        System.out.println("Item successfully added in the list!!!");

    }
   public int calculateTotal(){
        return this.totalPrice;
   }
   public void Display(){
       System.out.println("Your order No is "+ this.orderNo);
       System.out.println("Your ordered total is "+ this.totalPrice);
       System.out.println("Thank you for ordering!!");
   }
}
