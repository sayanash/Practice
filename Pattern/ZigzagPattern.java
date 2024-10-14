import java.util.Scanner;

public class ZigzagPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Character: ");
        String name = sc.nextLine();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= columns; j++) {
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print(name);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
