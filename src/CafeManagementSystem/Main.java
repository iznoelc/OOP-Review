package CafeManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in); // scanner for user input
        Cafe myCafe = new Cafe(); // create a cafe object

        String name, category;
        double price;
        MenuItem menuItem, item1, item2, item3;
        int item;

        // set up the menu by getting menu items from the user
        System.out.println("---ENTER MENU ITEMS---");
        for (int i = 1; i < 4; i++) {
            System.out.println("Enter menu item " + i + "'s name: ");
            name = scnr.nextLine();
            System.out.println("Enter menu item " + i + "'s price: ");
            price = Double.parseDouble(scnr.nextLine());
            System.out.println("Enter menu item " + i + "'s category: ");
            category = scnr.nextLine();

            menuItem = new MenuItem(name, price, category);
            if (i == 1) {
                myCafe.addMenuItem1(menuItem);
            } else if (i == 2) {
                myCafe.addMenuItem2(menuItem);
            } else {
                myCafe.addMenuItem3(menuItem);
            }
        }

        myCafe.displayMenu();
    }
}
