import java.util.Scanner;
public class Ej4{
	public static void main(String[] args){
		Scanner teclado=new Scanner (System.in);
		int num,num1;
		System.out.println("Dime dos numeros: ");
		num=teclado.nextInt();
		num1=teclado.nextInt();
		if (num>0 && num1>0)
		{
			System.out.println((num+num1)/2F);
		}
	}
}