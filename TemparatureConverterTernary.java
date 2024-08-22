import java.util.Scanner;

public class TemparatureConverterTernary {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter in  Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();

        double Celsius =(Fahrenheit-32)!=0?(Fahrenheit-32)*5/9: 0;
        System.out.println(Fahrenheit +"Fahrenheit is equel to "+ Celsius+" Celsius");

        scanner.close();
    }
}
