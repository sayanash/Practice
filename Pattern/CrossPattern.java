import java.util.Scanner;

public class CrossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for name and size
        System.out.print("Enter the Character: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the size of the cross: ");
        int size = sc.nextInt();
        
        // Print cross pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || j == (size - 1 - i)) {
                    System.out.print(name);
                } else {
                    System.out.print(" "); // Empty space
                }
            }
            System.out.println();
        }
    }
}
