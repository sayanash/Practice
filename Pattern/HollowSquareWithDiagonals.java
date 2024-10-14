import java.util.Scanner;

public class HollowSquareWithDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Character: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the size of the square: ");
        int size = sc.nextInt();
        
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size || i == j || j == (size - i + 1)) {
                    System.out.print(name +" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
