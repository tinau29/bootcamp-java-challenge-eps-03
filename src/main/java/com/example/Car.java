package com.example;

class Car {
    float fuelLiter;

    String name;

    Car(String name) {
        this.name = name;
    }

    void fuelRefill(float liter) {
        fuelLiter += liter;
    }

    float getFuel() {
        return fuelLiter;
    }

    String getName() {
        return name;
    }

    boolean run() {
        // TODO:
        // - return false if empty fuel
        // - decrease 1 liter per kilometer
        if (this.fuelLiter <= 0) {
            return false;
        }

        this.fuelLiter--;
        return true;
    }

    // tidak perlu method main
}
