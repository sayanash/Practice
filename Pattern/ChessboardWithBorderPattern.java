import java.util.Scanner;

public class ChessboardWithBorderPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for name and size
        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the size of the chessboard: ");
        int size = sc.nextInt();
        
        // Print top border
        for (int j = 0; j < size + 2; j++) {
            System.out.print("_");
        }
        System.out.println();
        
        // Print chessboard pattern with borders
        for (int i = 0; i < size; i++) {
            // Left border
            System.out.print("|");
            
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(name);
                } else {
                    System.out.print(" "); // Empty space
                }
            }
            // Right border
            System.out.print("|");
            System.out.println();
        }
        
        // Print bottom border
        for (int j = 0; j < size + 2; j++) {
            System.out.print("_");
        }
        System.out.println();
    }
}
