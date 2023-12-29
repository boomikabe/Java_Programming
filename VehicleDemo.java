package javaapplication3;

   class Vehicle {
    protected double speed;

    public Vehicle(double speed) {
        this.speed = speed;
    }

    public double calculateSpeed() {
        return speed;
    }
}

class Car extends Vehicle {
    private int numberOfPassengers;

    public Car(double speed, int numberOfPassengers) {
        super(speed);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public double calculateSpeed() {
        return super.calculateSpeed() * numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}

class Motorcycle extends Vehicle {
    private int numberOfWheels;

    public Motorcycle(double speed, int numberOfWheels) {
        super(speed);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public double calculateSpeed() {
        return super.calculateSpeed() * numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car(60.0, 4);
        Motorcycle motorcycle = new Motorcycle(80.0, 2);

        System.out.println("Car Speed: " + car.calculateSpeed() + " (Passengers: " + car.getNumberOfPassengers() + ")");

        System.out.println("Motorcycle Speed: " + motorcycle.calculateSpeed() + " (Wheels: " + motorcycle.getNumberOfWheels() + ")");

        if (car.calculateSpeed() > motorcycle.calculateSpeed()) {
            System.out.println("Car is faster");
        } else if (car.calculateSpeed() < motorcycle.calculateSpeed()) {
            System.out.println("Motorcycle is faster");
        } else {
            System.out.println("Both vehicles have the same speed");
        }
    }
}

