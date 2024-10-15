package Operators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first boolean (true/false): ");
        boolean a = sc.nextBoolean();
        
        System.out.print("Enter second boolean (true/false): ");
        boolean b = sc.nextBoolean();
        
        System.out.println("a && b: " + (a && b)); // Logical AND
        System.out.println("a || b: " + (a || b)); // Logical OR
        System.out.println("!a: " + (!a));         // Logical NOT


        sc.close();
    }
}

