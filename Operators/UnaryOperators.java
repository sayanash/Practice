package Operators;

import java.util.Scanner;

public class UnaryOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        
        System.out.println("x: " + x);
        System.out.println("++x: " + ++x); // Pre-increment
        System.out.println("x++: " + x++); // Post-increment
        System.out.println("x: " + x);     // New value of x
        
        System.out.println("--x: " + --x); // Pre-decrement
        System.out.println("x--: " + x--); // Post-decrement
        System.out.println("x: " + x);     // Final value of x

        sc.close();
    }
}
