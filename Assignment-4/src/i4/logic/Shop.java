package i4.logic;

public class Shop {
    private Product[] products=new Product[6];

    public Shop(Product[] products) {
        super();
        for(int i=0;i<products.length;i++) {
            this.products[i] = products[i];
        }
    }
    public void Displaydetails(){
        for(int i=0;i<this.products.length;i++) {
            System.out.println(i+1+")Product");
            this.products[i].Display();

            System.out.println();
        }
    }



}
