package Operators;

import java.util.Scanner;

public class InstanceofOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.next();
        
        boolean isString = input instanceof String;
        System.out.println("Is the input an instance of String? " + isString);

        sc.close();
    }
}

