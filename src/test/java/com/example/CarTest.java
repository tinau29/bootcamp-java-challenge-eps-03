package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void carFuelRefill()
    {


        String carName = "TestCar";
        Car car = new Car(carName);
        car.fuelRefill(10.0f);
        assertEquals(10.0f, car.getFuel(), 0.01f);
        assertEquals(carName, car.getName());


    }

    public void carFuelLiter()
    {


        String carName = "TestCar";
        Car car = new Car(carName);
        car.fuelRefill(10.0f);
        assertEquals(true, car.run());


    }

    @Test
    public void carEmptyLiter()
    {
        String carName = "TestCar";
        Car car = new Car(carName);
        car.fuelRefill(0.0f);
        assertEquals(false, car.run());
    }


}