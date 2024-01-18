import java.util.Scanner;
class atividade8
	{
	public static void main(String args[])
	{

	Scanner s= new Scanner(System.in);

	System.out.println("Digite a altura:");
	Double l= s.nextDouble();
	System.out.println("Digite a base:");
	Double b= s.nextDouble();

	Double area= l*b;
	Double adobro= (l*b)*2;

	System.out.println("Area do quadrado:" +area);
	
	System.out.println("Dobro da area do quadrado:" +adobro);
	}
}