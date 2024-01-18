import java.util.Scanner;

class Add{
	public static void main(String[] args){
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Digite primeiro numero");
	a=sc.nextInt();
	System.out.println("Digite segundo numero");
	b=sc.nextInt();
	c=addition(a,b);
	System.out.println("A adição dos dois números é :" +c);
	}
static int addition(int x,int y)
	{
	return x+y;
	}
}