package CafeManagementSystem;

import java.text.DecimalFormat;

public class Order {
    private MenuItem item1, item2, item3;
    private double totalAmount;

    public void addItem1(MenuItem item1){
        this.item1 = item1;
    }

    public void addItem2(MenuItem item2){
        this.item2 = item2;
    }

    public void addItem3(MenuItem item3){
        this.item3 = item3;
    }

    public void calculateTotal(){
        this.totalAmount = item1.getPrice() + item2.getPrice() + item3.getPrice();
    }

    public void displayOrderDetails(){
        // format total to only have two decimals
        DecimalFormat df = new DecimalFormat("0.00");
        double formattedTotal = Double.parseDouble(df.format(totalAmount));

        System.out.println("Your order details:");

        // print item info & then total price
        item1.printItemInfo();
        item2.printItemInfo();
        item3.printItemInfo();
        System.out.print("Total: $" + formattedTotal);
    }
}
