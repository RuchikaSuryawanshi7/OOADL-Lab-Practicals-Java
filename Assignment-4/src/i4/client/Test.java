package i4.client;

import i4.logic.Product;
import i4.logic.Shop;

public class Test {

    public static void main(String[] args) {

        Product p0=   new Product("file", 60, 12);
        Product p1= new Product("Dairy", 300, 5);
        Product p2= new Product("Ball pen ", 10, 2);
        Product productarr[] = {p0,p1,p2};
        Shop s1=new Shop(productarr);
        s1.Displaydetails();
    }






}



