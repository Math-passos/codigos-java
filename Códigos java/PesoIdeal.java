import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        double altura, pesoIdeal;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite sua altura em metros: ");
        altura = input.nextDouble();
        
        pesoIdeal = (72.7 * altura) - 58;
        
        System.out.printf("Seu peso ideal é %.2f kg.", pesoIdeal);
    }
}
