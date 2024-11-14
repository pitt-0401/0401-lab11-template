/*
 * Created on 2026-11-04
 * 
 * Copyright (c) 2026 Nadine von Frankenberg
 */

public class LatteMacchiato extends Coffee {
    private String flavor = "plain";
    private boolean iced;

    public LatteMacchiato(String size) {
        this(size, "plain", false);
    }

    public LatteMacchiato(String size, String flavor) {
        this(size, flavor, false);
    }

    public LatteMacchiato(String size, String flavor, boolean iced) {
        super("Latte Macchiato", size);
        this.iced = iced;
        setFlavor(flavor);
    }

    // Only plain, vanilla, and lavender are on the menu
    private void setFlavor(String flavor) {
        if (flavor == null || flavor.equalsIgnoreCase("plain")) {
            return;
        }
        if (flavor.equalsIgnoreCase("vanilla") || flavor.equalsIgnoreCase("lavender")) {
            this.flavor = flavor.toLowerCase();
        } else {
            System.out.println("Unknown flavor, making a plain one: " + flavor);
        }
    }

    @Override
    public String getType() {
        String type = super.getType() + " (" + this.flavor + ")";
        if (this.iced) {
            return "Iced " + type;
        }
        return type;
    }

    @Override
    public void make() {
        if (!this.flavor.equals("plain")) {
            System.out.println(" - Adding " + this.flavor + " syrup");
        }
        if (this.iced) {
            System.out.println(" - Adding ice and cold milk");
        } else {
            System.out.println(" - Adding steamed milk");
        }
        System.out.println(" - Pouring an espresso shot on top");
    }
}
