package i4.client;

import i4.logic.Item;
import i4.logic.Order;

public class Test {
    public static void main(String[] args) {
        Order order = new Order("AA1");
        Item item1 = new Item("ahkahd11",1400, 5);
        Item item2 = new Item("euyitr4",1000, 2);
        Item item3 = new Item("yw8AIG",2400, 1);
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);
        System.out.println("Your order total is "+ order.calculateTotal());
        order.Display();
    }
}
