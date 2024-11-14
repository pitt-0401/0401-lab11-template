/*
 * Created on 2026-10-28
 * 
 * Copyright (c) 2026 Nadine von Frankenberg
 */

public class Espresso extends Coffee {
    // 1 = single (standard), 2 = doppio
    private int shots;

    // An espresso is small with one shot as the default
    public Espresso() {
        this("small", 1);
    }

    public Espresso(String size) {
        this(size, 1);
    }

    public Espresso(String size, int shots) {
        super("Espresso", size);
        this.shots = shots;
    }

    @Override
    public String getType() {
        if (this.shots == 2) {
            return "Doppio " + super.getType();
        }
        return super.getType();
    }

    @Override
    public void make() {
        for (int i = 0; i < this.shots; i++) {
            System.out.println(" - Adding an espresso shot");
        }
    }
}
