/*
 * Created on 2026-11-04
 * 
 * Copyright (c) 2026 Nadine von Frankenberg
 */

import java.util.Random;

public class Barista {
    private Random random = new Random();

    // TODO Task 1: prepare every coffee of the order
    public void prepareOrder(Order order) {
        Coffee coffee = order.getCoffee();
        System.out.println("Preparing " + coffee + " ...");
        // Each coffee type knows its own steps
        coffee.make();
        coffee.setReadyForPickup();
        order.markFulfilled();
        callForPickup(order);
    }

    // TODO Task 1: check the whole order (not a single coffee)
    private void callForPickup(Order order) {
        if (!order.getCoffee().isReadyForPickup()) {
            System.out.println("Order is not ready");
            return;
        }
        String name = messUpName(order.getCustomer().getName());
        System.out.println("I have a pickup for " + name + ", " + order.getCoffee());
    }

    // Just for fun: sometimes the first letter gets misheard
    private String messUpName(String name) {
        if (random.nextBoolean()) {
            char c = (char) (random.nextInt(26) + 'A');
            name = c + name.substring(1);
        }
        return name;
    }
}
