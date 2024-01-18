import java.util.Scanner;
class AreadoCirculo{

	public static void main(String[] args){
	double pi,r,area;
	Scanner s= new Scanner(System.in);

	System.out.println("Digite o raio :");
	r= s.nextDouble();
	r=r;
	pi=3.14;
	area=(pi*r*r);
	System.out.println("O raio do círculo é :" +r);
	System.out.println("A area do circulo é :" +area);
	}
}