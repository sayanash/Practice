package Operators;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        
        System.out.println("x == y: " + (x == y)); // Equal to
        System.out.println("x != y: " + (x != y)); // Not equal to
        System.out.println("x > y: " + (x > y));   // Greater than
        System.out.println("x < y: " + (x < y));   // Less than
        System.out.println("x >= y: " + (x >= y)); // Greater than or equal to
        System.out.println("x <= y: " + (x <= y)); // Less than or equal to


    sc.close();
    }
}
