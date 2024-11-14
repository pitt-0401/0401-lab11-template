/*
 * Created on 2026-11-04
 * 
 * Copyright (c) 2026 Nadine von Frankenberg
 */

public class CodeBrewCafe {
    // The café has one barista
    private static Barista barista = new Barista();

    public static void main(String[] args) {
        Customer lorelai = new Customer("Lorelai");
        Customer rory = new Customer("Rory");
        Customer elmo = new Customer("Elmo");

        // Simulate the orders, first come first serve
        processOrder(new Order(lorelai, new Cappuccino("medium")));
        processOrder(new Order(rory, new LatteMacchiato("large", "vanilla", true)));
        processOrder(new Order(elmo, new Espresso("small", 2)));
        // A customer can order again once their last order is done
        processOrder(new Order(lorelai, new LatteMacchiato("medium")));

        // TODO Task 1: create and process a group order (several coffees)
        // TODO Task 2: add coffees by type name and size
        // TODO Task 3: apply the iced special to an order
    }

    public static void processOrder(Order order) {
        System.out.println("\nOrder #" + order.getOrderId() + " for " + order.getCustomer().getName());
        barista.prepareOrder(order);
        // TODO Task 1: print the receipt
    }

    // TODO Task 2: overload processOrder (one coffee for one customer)

}
