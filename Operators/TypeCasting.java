package Operators;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        
        // Explicit type casting from double to int
        int i = (int) d;
        
        System.out.println("Double value: " + d);
        System.out.println("Casted to int: " + i);

        sc.close();
    }
}
