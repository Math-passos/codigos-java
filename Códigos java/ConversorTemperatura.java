import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = input.nextDouble();
        
        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5/9;
        
        System.out.printf("%.2f Fahrenheit é equivalente a %.2f Celsius", temperaturaFahrenheit, temperaturaCelsius);
    }
}
