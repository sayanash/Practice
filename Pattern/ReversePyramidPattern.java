import java.util.Scanner;

public class ReversePyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for name and height
        System.out.print("Enter the Character: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the height of the pyramid: ");
        int height = sc.nextInt();
        
        // Print reverse pyramid pattern
        for (int i = height; i >= 1; i--) {
            // Print spaces
            for (int j = height; j > i; j--) {
                System.out.print(" "); // 5 spaces for alignment
            }
            // Print names
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(name);
            }
            System.out.println();
        }
    }
}
