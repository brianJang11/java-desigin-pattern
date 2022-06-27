package structural.decorator.Tests;

import structural.decorator.BasicCar;
import structural.decorator.Car;
import structural.decorator.LuxuryCar;
import structural.decorator.SportsCar;

public class TestDecorator {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxyryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxyryCar.assemble();
    }
}
