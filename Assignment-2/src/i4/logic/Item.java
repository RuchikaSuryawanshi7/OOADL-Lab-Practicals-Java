package i4.logic;

public class Item {
    String ItemCode;
    int price;
    int quantity;
    int subTotal;

    public Item(String itemCode, int price, int quantity) {
        ItemCode = itemCode;
        this.price = price;
        this.quantity = quantity;
        this.subTotal = 0;
    }
    public  int calculateSubtotal(){
        this.subTotal = this.price * this.quantity;
        //System.out.println("The subtotal is : "+ this.subTotal);
        return subTotal;
    }
}
