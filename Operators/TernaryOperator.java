package Operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        int result = (a > b) ? a : b;
        System.out.println("The greater number is: " + result);

        sc.close();
    }
}

