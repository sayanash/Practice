package Operators;

import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        
        System.out.println("a & b: " + (a & b)); // Bitwise AND
        System.out.println("a | b: " + (a | b)); // Bitwise OR
        System.out.println("a ^ b: " + (a ^ b)); // Bitwise XOR
        System.out.println("~a: " + (~a));       // Bitwise NOT
        
        System.out.println("a << 1: " + (a << 1));  // Left shift
        System.out.println("a >> 1: " + (a >> 1));  // Right shift

        sc.close();
    }
}
