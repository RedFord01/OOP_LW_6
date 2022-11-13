package carshop.impl;

import carshop.cars.*;
import carshop.intface.Admin;
import carshop.intface.Customer;

import java.util.Scanner;

public class MyOwnAutoShop implements Admin, Customer {
    @Override
    public double getIncome() {
        double income = 0;
        for (Car car : shop) {
            if (car.isSellOut) income += car.getSalePrice(car.regularPrice);
        }
        return income;
    }
    @Override
    public void getCarsPrice() {
        for (Car car : shop) {
            System.out.println(car.regularPrice);
        }
    }
    @Override
    public void getCarsColors() {
        for (Car car : shop) {
            System.out.println(car.color);
        }
    }
    @Override
    public double getCarPrice(int id) {
        return shop[id].getSalePrice(shop[id].regularPrice);
    }
    @Override
    public String getCarColor(int id) {
        return shop[id].color;
    }
    @Override
    public void purchaseCar(int id) {
        shop[id].isSellOut = true;
    }
    Car[] shop = new Car[5]; {

        Sedan sedan = new Sedan();
        shop[0] = sedan;
        Ford ford1 = new Ford();
        shop[1] = ford1;
        Ford ford2 = new Ford();
        shop[2] = ford2;
        Truck truck1 = new Truck();
        shop[3] = truck1;
        Truck truck2 = new Truck();
        shop[4] = truck2;

        Scanner in = new Scanner(System.in);
        System.out.println("/***Please enter details about the cars***/\n".toUpperCase());
        System.out.println("Enter details about sedan".toUpperCase());
        System.out.println("Enter speed: ");
        sedan.setSpeed(in.nextInt());
        System.out.println("Enter regular price: ");
        sedan.setRegularPrice(in.nextInt());
        System.out.println("Enter color: ");
        sedan.setColor(in.next());
        System.out.println("Enter length: ");
        sedan.setLength(in.nextInt());

        for (int i = 1; i < 3; i++) {
            System.out.println("Enter details about ford".toUpperCase());
            System.out.println("Enter speed: ");
            shop[i].setSpeed(in.nextInt());

            System.out.println("Enter regular price: ");
            shop[i].setRegularPrice(in.nextInt());

            System.out.println("Enter color: ");
            shop[i].setColor(in.next());

            System.out.println("Enter year of manufacture: ");
            if (i == 1)
                ford1.setYear(in.nextInt());
            else
                ford2.setYear(in.nextInt());

            System.out.println("Enter manufacturer discount: ");
            if (i == 1)
                ford1.setManufacturerDiscount(in.nextInt());
            else
                ford2.setManufacturerDiscount(in.nextInt());
        }

        for (int i = 3; i < 5; i++) {

            System.out.println("Enter details about truck".toUpperCase());
            System.out.println("Enter speed: ");
            shop[i].setSpeed(in.nextInt());

            System.out.println("Enter regular price: ");
            shop[i].setRegularPrice(in.nextInt());

            System.out.println("Enter color: ");
            shop[i].setColor(in.next());

            System.out.println("Enter weight: ");
            if (i == 3)
                truck1.setWeight(in.nextInt());
            else
                truck2.setWeight(in.nextInt());

        }
        System.out.println("Welcome to my car shop!");
        System.out.println("The colors aviable: ");
        getCarsColors();
        System.out.println("Car prices: ");
        getCarsPrice();
        System.out.println("See! They are very affordable :)");
        System.out.println("If you are interested in - type car number to see details (up to 5): ");
        int userInput = in.nextInt() - 1;
        if (userInput != 5) {
            System.out.println("The price is: " + getCarPrice(userInput));
            System.out.println("The color is: " + getCarColor(userInput));
        }
        System.out.println("Do you like something? I hope yes :) - type number to buy a brand new car: " +
                "(up to 5, again): ");
        userInput = in.nextInt() - 1;

        if (userInput != 5) {
            purchaseCar(userInput);
        }
        in.close();

        System.out.println("Income is: " + getIncome());
    }
}
