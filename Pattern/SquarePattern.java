import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for name, height, and width
        System.out.print("Enter the character: ");
        String inputCharacter = sc.nextLine();
        
        System.out.print("Enter the height of the pattern: ");
        int height = sc.nextInt();
        
        System.out.print("Enter the width of the pattern: ");
        int width = sc.nextInt();
        
        // Print square/rectangle pattern
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(inputCharacter + " ");
            }
            System.out.println();
        }
    }
}
