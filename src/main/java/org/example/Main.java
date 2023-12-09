package org.example;
//дороблена до HW20
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        Calculator calculator = new Calculator();

        System.out.println("Sum: " + calculator.add(a,b));
        System.out.println("Difference: " + calculator.subtract(a, b));
        System.out.println("Product: " + calculator.multiply(a, b));
        try {
            System.out.println("Quotient: " + calculator.quotient(a, b));
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}