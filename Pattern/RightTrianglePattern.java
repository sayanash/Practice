import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for name and height
        System.out.print("Enter the character: ");
        String inputCharacter = sc.nextLine();
        
        System.out.print("Enter the height of the triangle: ");
        int height = sc.nextInt();
        
        // Print right triangle pattern
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(inputCharacter);
            }
            System.out.println();
        }
    }
}
