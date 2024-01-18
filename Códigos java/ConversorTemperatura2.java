import java.util.Scanner;

public class ConversorTemperatura2 {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        celsius = input.nextDouble();
        
        fahrenheit = (celsius * 1.8) + 32;
        
        System.out.printf("%.2f graus Celsius correspondem a %.2f graus Fahrenheit.", celsius, fahrenheit);
    }
}
