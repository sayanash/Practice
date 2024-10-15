package Operators;

import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        
        a += 5; // a = a + 5
        System.out.println("After a += 5, a: " + a);
        
        a -= 3; // a = a - 3
        System.out.println("After a -= 3, a: " + a);
        
        a *= 2; // a = a * 2
        System.out.println("After a *= 2, a: " + a);
        
        a /= 4; // a = a / 4
        System.out.println("After a /= 4, a: " + a);
        
        a %= 3; // a = a % 3
        System.out.println("After a %= 3, a: " + a);

        sc.close();
    }
}
