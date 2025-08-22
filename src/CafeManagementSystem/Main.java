package CafeManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scnr = new Scanner(System.in); // scanner for user input
        Cafe myCafe = new Cafe(); // create a cafe object
        Order myOrder = new Order(); // create an order object to track user order

        String name, category;
        double price;
        MenuItem menuItem;
        int item;

        System.out.println("---ENTER MENU ITEMS---");
        for (int i = 1; i < 4; i++){
            // get menu item details
            System.out.println("Enter menu item " + i + "'s name: ");
            name = scnr.nextLine();
            System.out.println("Enter menu item " + i + "'s price: ");
            price = Double.parseDouble(scnr.nextLine());
            System.out.println("Enter menu item " + i + "'s category: ");
            category = scnr.nextLine();

            // use constructor to create new menu item
            menuItem = new MenuItem(name, price, category);
            // use the proper "addMenuItem" method depending on which iteration the loop is currently on
            if (i == 1){
                myCafe.addMenuItem1(menuItem);
            } else if (i == 2){
                myCafe.addMenuItem2(menuItem);
            } else {
                myCafe.addMenuItem3(menuItem);
            }
        }

        myCafe.displayMenu();

        // get the user's order
        System.out.println("---ENTER ORDER---");
        System.out.println("Enter the first item of your order (1, 2, or 3): ");
        item = scnr.nextInt();
        while (item < 1 || item > 3){
            System.out.println("Invalid item number!");
            System.out.println("Enter the first item of your order (1, 2, or 3): ");
            item = scnr.nextInt();
        }

        // assign item 1 to the proper menu item according to user's input
        // repeat this for item 2 & item 3
        if (item == 1){
            myOrder.addItem1(myCafe.getMenuItem1());
        } else if (item == 2){
            myOrder.addItem1(myCafe.getMenuItem2());
        } else {
            myOrder.addItem1(myCafe.getMenuItem3());
        }

        System.out.println("Enter the second item of your order (1, 2, or 3): ");
        item = scnr.nextInt();
        while (item < 1 || item > 3){
            System.out.println("Invalid item number!");
            System.out.println("Enter the second item of your order (1, 2, or 3): ");
            item = scnr.nextInt();
        }

        if (item == 1){
            myOrder.addItem2(myCafe.getMenuItem1());
        } else if (item == 2){
            myOrder.addItem2(myCafe.getMenuItem2());
        } else {
            myOrder.addItem2(myCafe.getMenuItem3());
        }

        System.out.println("Enter the third item of your order (1, 2, or 3): ");
        item = scnr.nextInt();
        while (item < 1 || item > 3){
            System.out.println("Invalid item number!");
            System.out.println("Enter the third item of your order (1, 2, or 3): ");
            item = scnr.nextInt();
        }

        if (item == 1){
            myOrder.addItem3(myCafe.getMenuItem1());
        } else if (item == 2){
            myOrder.addItem3(myCafe.getMenuItem2());
        } else {
            myOrder.addItem3(myCafe.getMenuItem3());
        }

        myCafe.placeOrder(myOrder); // place order with the three chosen items
        myCafe.getCurrentOrder().displayOrderDetails(); // display the user's order details
    }
}
