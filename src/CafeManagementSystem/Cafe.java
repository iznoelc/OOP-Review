package CafeManagementSystem;

import java.text.DecimalFormat;

public class Cafe {
    public MenuItem item1, item2, item3;
    public Order currentOrder;

    public void addMenuItem1(MenuItem item1){
        this.item1 = item1;
    }

    public void addMenuItem2(MenuItem item2){
        this.item2 = item2;
    }

    public void addMenuItem3(MenuItem item3){
        this.item3 = item3;
    }

    public void placeOrder(MenuItem item1, MenuItem item2, MenuItem item3){
        currentOrder.addItem1(item1);
        currentOrder.addItem2(item2);
        currentOrder.addItem3(item3);
    }

    public void displayMenu(){
        System.out.println("---CAFE MENU---");
        System.out.print("1. ");
        item1.printItemInfo();
        System.out.print("2. ");
        item2.printItemInfo();
        System.out.print("3. ");
        item3.printItemInfo();
    }
}
