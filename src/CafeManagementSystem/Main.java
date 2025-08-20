package CafeManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scnr = new Scanner(System.in); // scanner for user input
        Cafe myCafe = new Cafe(); // create a cafe object

        String name, category;
        double price;
        MenuItem menuItem, item1, item2, item3;
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
            System.out.println("Enter the first item of your order: ");
            item = scnr.nextInt();
        }

        // assign item 1 to the proper menu item according to user's input
        // repeat this for item 2 & item 3
        if (item == 1){
            item1 = myCafe.item1;
        } else if (item == 2){
            item1 = myCafe.item2;
        } else {
            item1 = myCafe.item3;
        }

        System.out.println("Enter the second item of your order: ");
        item = scnr.nextInt();
        while (item < 1 || item > 3){
            System.out.println("Invalid item number!");
            System.out.println("Enter the second item of your order: ");
            item = scnr.nextInt();
        }

        if (item == 1){
            item2 = myCafe.item1;
        } else if (item == 2){
            item2 = myCafe.item2;
        } else {
            item2 = myCafe.item3;
        }

        System.out.println("Enter the third item of your order: ");
        item = scnr.nextInt();
        while (item < 1 || item > 3){
            System.out.println("Invalid item number!");
            System.out.println("Enter the third item of your order: ");
            item = scnr.nextInt();
        }

        if (item == 1){
            item3 = myCafe.item1;
        } else if (item == 2){
            item3 = myCafe.item2;
        } else {
            item3 = myCafe.item3;
        }

        myCafe.placeOrder(item1, item2, item3); // place order with the three chosen items
        myCafe.currentOrder.calculateTotal(); // calculate the total of the user's chosen items
        myCafe.currentOrder.displayOrderDetails(); // display the user's order details
    }
}
