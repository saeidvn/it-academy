package com.itacademy.course.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String type;
        double a, b;

        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter yor type(add, sub, mul, div) = "); type = in.nextLine();
        System.out.print("First Number = "); a = in.nextDouble();
        System.out.print("Second Number = "); b = in.nextDouble();

        switch (type) {
            case "add":
                System.out.println("Result = " + calculator.addition(a, b));
                break;
            case "sub":
                System.out.println("Result = " + calculator.subtract(a, b));
                break;
            case "mul":
                System.out.println("Result = " + calculator.multiply(a, b));
                break;
            case "div":
                System.out.println("Result = " + calculator.divide(a, b));
                break;
            default:
                System.out.println("Incorrect type!");
                break;
        }
    }
}