/*
 * Created on 2026-11-04
 * 
 * Copyright (c) 2026 Nadine von Frankenberg
 */

public class Cappuccino extends Coffee {

    public Cappuccino(String size) {
        super("Cappuccino", size);
    }

    @Override
    public void make() {
        System.out.println(" - Pulling an espresso shot");
        System.out.println(" - Adding steamed milk");
        System.out.println(" - Topping with milk foam");
    }
}
