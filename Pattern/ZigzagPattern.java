import java.util.Scanner;

public class ZigzagPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for name and height
        System.out.print("Enter the Character: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the height of the zigzag: ");
        int height = sc.nextInt();
        
        // Print zigzag pattern
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(name);
                } else {
                    System.out.print(" "); // Empty space
                }
            }
            System.out.println();
        }
    }
}
