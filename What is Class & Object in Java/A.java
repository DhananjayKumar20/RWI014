Class and Object in Java

In Java, a class is a blueprint for creating objects. It defines the properties (fields) and behaviors (methods) that the objects created from the class will have. For example, a `Car` class may have fields like `color` and `model`, and methods like `drive()` and `brake()`.

An object is an instance of a class. When you create an object from a class, you allocate memory for that instance and initialize its properties. For example, `Car myCar = new Car();` creates an object `myCar` of the `Car` class, allowing you to interact with its fields and methods.

public class Car {
    String color;
    String model;

    void drive() {
        System.out.println("Driving " + model);
    }

    void brake() {
        System.out.println("Braking " + model);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Tesla Model 3";
        myCar.drive();
        myCar.brake();
    }
}


This example defines a `Car` class and creates an object `myCar` to demonstrate its use.
