import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for name, height, and width
        System.out.print("Enter the Character: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the height of the pattern: ");
        int height = sc.nextInt();
        
        System.out.print("Enter the width of the pattern: ");
        int width = sc.nextInt();
        
        // Print hollow square pattern
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print(name);
                } else {
                    System.out.print(" "); // Empty space inside
                }
            }
            System.out.println();
        }
    }
}
