package i4.logic;
/*A shop has products. Each product has product name, product price, tax in percentage and total price
The tax paid for each product can be computed as product price multiplied by tax as a fractional
number. The total price of each product can be calculated as product price plus tax paid.*/
public class Product {
    String productName;
    int productPrice;
    double tax;
    double totalPrice;
    double totalTaxPaid;

    public Product(String productName, int productPrice, double tax) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.tax = tax;
    }
    public double taxToBePaid(){
        this.totalTaxPaid = this.productPrice * this.tax;
        return this.totalTaxPaid;
    }
    public double totalPricePaid(){
        this.totalPrice = this.productPrice + this.totalTaxPaid;
        return this.totalPrice;
    }
    public void Display(){
        System.out.println("Your product name is: "+ this.productName);
        System.out.println("Your product price is: "+ this.productPrice);
        System.out.println("Your product tax to be paid is: "+ this.totalTaxPaid);
        System.out.println("Your product total price to be paid is: "+ this.totalPrice);

    }
}
