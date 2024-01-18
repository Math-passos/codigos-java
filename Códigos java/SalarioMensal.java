import java.util.Scanner;

public class SalarioMensal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = input.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = input.nextDouble();
        
        double salarioMensal = valorHora * horasTrabalhadas;
        
        System.out.printf("Seu salário mensal é R$%.2f", +salarioMensal);
    }
}
