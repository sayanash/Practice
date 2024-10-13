import java.util.Scanner;

public class HourglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for name and height
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the height of the hourglass: ");
        int height = sc.nextInt();
        
        // Upper part of hourglass
        for (int i = height; i >= 1; i--) {
            // Print spaces
            for (int j = height - i; j > 0; j--) {
                System.out.print(" "); // Empty spaces
            }
            // Print names
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(name);
            }
            System.out.println();
        }
        
        // Lower part of hourglass
        for (int i = 2; i <= height; i++) {
            // Print spaces
            for (int j = height - i; j > 0; j--) {
                System.out.print(" "); // Empty spaces
            }
            // Print names
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(name);
            }
            System.out.println();
        }
    }
}
