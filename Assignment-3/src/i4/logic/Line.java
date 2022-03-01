package i4.logic;

public class Line {
    String name;
    int price;
    int quantity;
    int subTotal;

    public Line(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.subTotal = 0;
    }
    public int calSubTotal(){
        this.subTotal = this.price * this.quantity;
        return this.subTotal;
    }
}
