import java.util.Random;

public class jokenpo {
    private int jogador;
    private int computador;
    private int pontosJogador;
    private int pontosComputador;

    public void novoJogo() {
        pontosJogador = 0;
        pontosComputador = 0;
        System.out.println("________Jokenpo Iniciado__________");
    }

    public void escolhaDoJogador(int escolha) {
        jogador = escolha;
        System.out.println("Jogador escolheu: " + escolhaToString(jogador));
    }

    public void escolhaDoComputador() {
        Random rand = new Random();
        computador = rand.nextInt(3) + 1;
        System.out.println("Computador escolheu: " + escolhaToString(computador));
    }

    public void quemGanha() {
        if ((jogador == 1 && computador == 2) ||
                (jogador == 2 && computador == 3) ||
                (jogador == 3 && computador == 1)) {
            pontosJogador++;
            System.out.println("Jogador venceu!");
        } else if ((jogador == 1 && computador == 3) ||
                (jogador == 2 && computador == 1) ||
                (jogador == 3 && computador == 2)) {
            pontosComputador++;
            System.out.println("Computador venceu!");
        } else {
            System.out.println("Empate!");
        }
    }

    public void imprimirPlacar() {
        System.out.println("Placar: Jogador " + pontosJogador + " x " + pontosComputador + " Computador");
    }

    public boolean verificarTerminoDeJogo() {
        if (pontosJogador >= 2 || pontosComputador >= 2) {
            return true;
        } else {
            return false;
        }
    }

    private String escolhaToString(int escolha) {
        if (escolha == 1) {
            return "Papel";
        } else if (escolha == 2) {
            return "Pedra";
        } else {
            return "Tesoura";
        }
    }
}
