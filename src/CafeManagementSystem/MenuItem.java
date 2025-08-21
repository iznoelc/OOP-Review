package CafeManagementSystem;

import java.text.DecimalFormat;

public class MenuItem {
    private String name;
    private double price;
    private String category;

    // constructor to initialize menu item name, price, and category
    public MenuItem(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // getters & setters for each menu item variable
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void displayItemInfo(){
        // format price to only have two decimals
        DecimalFormat df = new DecimalFormat("0.00");
        double formattedPrice = Double.parseDouble(df.format(price));

        // print out menu item information
        System.out.println("Menu item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + formattedPrice);
        System.out.println("--------------------------");
    }
}
