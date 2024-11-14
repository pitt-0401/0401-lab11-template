/*
 * Created on 2026-10-28
 * 
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// One order = one customer + one coffee
public class Order {
    // Shared by all orders, so every order gets a new ID
    private static int nextOrderId = 1;

    private int orderId;
    private Customer customer;
    // TODO Task 1: an order can hold several coffees (use a List)
    private Coffee coffee;
    private boolean fulfilled = false;

    public Order(Customer customer, Coffee coffee) {
        this.orderId = nextOrderId++;
        this.customer = customer;
        this.coffee = coffee;
    }

    // TODO Task 1: add a constructor Order(Customer customer) for an empty order

    // TODO Task 1: add addCoffee(Coffee coffee)

    // TODO Task 2: overload addCoffee(String type, String size)
    // The coffee type is chosen at runtime, e.g. addCoffee("cappuccino", "medium")
    // Menu: cappuccino, latte macchiato, espresso, doppio (ignore upper/lower case)

    // TODO Task 3: add applyIcedSpecial()
    // Makes every Latte Macchiato in the order iced

    // TODO Task 1: add printReceipt(), lists all coffees of the order

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public boolean isFulfilled() {
        return fulfilled;
    }

    public void markFulfilled() {
        this.fulfilled = true;
    }
}
