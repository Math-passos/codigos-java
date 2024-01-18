import java.util.Scanner;

class logica{
	public static void main(String[] args){
	int nota1,nota2,nota3,nota4,media;
	Scanner in = new Scanner(System.in);

	System.out.println("Nota primeiro bimestre:");
	nota1= in.nextInt();

	System.out.println("Nota segundo bimestre:");
	nota2 = in.nextInt();

	System.out.println("Nota terceiro bimestre:");
	nota3 = in.nextInt();

	System.out.println("Nota quarto bimestre:");
	nota4 = in.nextInt();

	media = (nota1+nota2+nota3+nota4)/4;
	System.out.println("A media do aluno é :"+ media);

	}
}