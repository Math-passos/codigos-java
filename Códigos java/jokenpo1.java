import java.util.Scanner;
import java.util.Random;

public class java jokenpo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int rodadas = 5;
        int pontosUsuario = 0;
        int pontosComputador = 0;
        
        System.out.println("<<<<<<<<<<<Bem-vindo ao jogo Jokenpo!>>>>>>>>>>>");
        System.out.println("Você jogará " + rodadas + " rodadas contra o computador.");

        for (int i = 1; i <= rodadas; i++) {
            System.out.println("\nRodada " + i + ": Escolha sua jogada (1 - Pedra, 2 - Papel, 3 - Tesoura): ");
            int escolhaUsuario = input.nextInt();
            int escolhaComputador = rand.nextInt(3) + 1;
            
            switch (escolhaUsuario) {
                case 1:
                    System.out.println("Você escolheu Pedra.");
                    break;
                case 2:
                    System.out.println("Você escolheu Papel.");
                    break;
                case 3:
                    System.out.println("Você escolheu Tesoura.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    i--;
                    continue;
            }
            
            switch (escolhaComputador) {
                case 1:
                    System.out.println("O computador escolheu Pedra.");
                    break;
                case 2:
                    System.out.println("O computador escolheu Papel.");
                    break;
                case 3:
                    System.out.println("O computador escolheu Tesoura.");
                    break;
            }
            
            if (escolhaUsuario == escolhaComputador) {
                System.out.println("Empate!");
            } else if ((escolhaUsuario == 1 && escolhaComputador == 3) || 
                       (escolhaUsuario == 2 && escolhaComputador == 1) || 
                       (escolhaUsuario == 3 && escolhaComputador == 2)) {
                System.out.println("Você venceu a rodada!");
                pontosUsuario++;
            } else {
                System.out.println("O computador venceu a rodada.");
                pontosComputador++;
            }
        }
        
        System.out.println("\nFim de jogo!");
        System.out.println("Seu Número de pontuação" + pontosUsuario);
        System.out.println("Pontuação do computador " + pontosComputador);
        
        if (pontosUsuario > pontosComputador) {
            System.out.println("Parabéns, você venceu o jogo!");
        } else if (pontosUsuario < pontosComputador) {
            System.out.println("O computador venceu o jogo. Tente novamente.");
        } else {
            System.out.println("O jogo empatou.");
        }
    }
}
