import java.util.Scanner;
public class Ej3{
	public static void main(String[] args){
		Scanner teclado=new Scanner (System.in);
		int num,num1;
		System.out.println("Dime dos numeros: ");
		num=teclado.nextInt();
		num1=teclado.nextInt();
		if (num==num1)
		{
			System.out.println("Tus numeros son iguales");
		}
	}
}