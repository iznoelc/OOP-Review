package CafeManagementSystem;

public class Cafe {
    private MenuItem menuItem1, menuItem2, menuItem3;
    private Order currentOrder = new Order();

    public void addMenuItem1(MenuItem menuItem1){
        this.menuItem1 = menuItem1;
    }

    public void addMenuItem2(MenuItem menuItem2){
        this.menuItem2 = menuItem2;
    }

    public void addMenuItem3(MenuItem menuItem3){
        this.menuItem3 = menuItem3;
    }

    public MenuItem getMenuItem1(){
        return menuItem1;
    }

    public MenuItem getMenuItem2(){
        return menuItem2;
    }

    public MenuItem getMenuItem3(){
        return menuItem3;
    }

    public Order getCurrentOrder(){
        return currentOrder;
    }

    public void placeOrder(Order order){
        currentOrder.addItem1(order.getItem1());
        currentOrder.addItem2(order.getItem2());
        currentOrder.addItem3(order.getItem3());
    }

    public void displayMenu(){
        System.out.println("---CAFE MENU---");
        System.out.print("1. ");
        menuItem1.displayItemInfo();
        System.out.print("2. ");
        menuItem2.displayItemInfo();
        System.out.print("3. ");
        menuItem3.displayItemInfo();
    }
}
