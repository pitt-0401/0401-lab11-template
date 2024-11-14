/*
 * Created on 2026-11-04
 * 
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// Abstract: there is no plain "Coffee" on the menu, only its subclasses
public abstract class Coffee {
    private String type;
    // small, medium, or large
    private String size;
    private boolean readyForPickup = false;

    public Coffee(String type, String size) {
        this.type = type;
        this.size = size;
    }

    // The steps to make a coffee depend on its type
    public abstract void make();

    public String getType() {
        return this.type;
    }

    public String getSize() {
        return this.size;
    }

    public boolean isReadyForPickup() {
        return this.readyForPickup;
    }

    public void setReadyForPickup() {
        this.readyForPickup = true;
    }

    @Override
    public String toString() {
        return this.size + " " + this.getType();
    }
}
