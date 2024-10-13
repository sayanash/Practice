import java.util.Scanner;

public class DiamondWithBorderPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for name and height
        System.out.print("Enter the Character: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the height of the upper half of the diamond: ");
        int height = sc.nextInt();
        
        // Upper part of diamond
        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" "); // 5 spaces for alignment
            }
            // Print names
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print(name); // Border names
                } else {
                    System.out.print(" "); // Empty space inside
                }
            }
            System.out.println();
        }
        
        // Lower part of diamond
        for (int i = height - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" "); // 5 spaces for alignment
            }
            // Print names
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print(name); // Border names
                } else {
                    System.out.print(" "); // Empty space inside
                }
            }
            System.out.println();
        }
    }
}
