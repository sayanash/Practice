import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter temparature : ");
        double Fahrenheit =scanner.nextDouble();
        double Celsius;

        if (Fahrenheit!=0){
            Celsius = (Fahrenheit -32)*5/9;
        }else{
            Celsius = -17.78;
        }
        System.out.println(Fahrenheit +"Fahrenheit is equel to "+ Celsius+" Celsius");

        scanner.close();
    }
}
