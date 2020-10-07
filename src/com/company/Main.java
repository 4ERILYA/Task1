package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius = readRadius();
        printArea(calculateArea(radius));
    }

    public static double calculateAreaSquare(double radius) {
        return Math.pow(radius * 2, 2);
    }

    public static double calculateAreaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double radius) {
        return (calculateAreaSquare(radius) - calculateAreaCircle(radius)) / 2;
    }

    public static void printArea(double area) {
        System.out.printf("The area of the shaded part is equal to %f!%n", area);
    }

    public static double readRadius() {
        System.out.print("Write radius circle ");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}