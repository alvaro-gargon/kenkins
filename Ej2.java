import java.util.Scanner;
public class Ej2{
	public static void main(String[] args){
		Scanner teclado=new Scanner (System.in);
		int num;
		System.out.println("Dime un numero: ");
		num=teclado.nextInt();
		if (num<0)
		{
			System.out.println(num*(-1));
		}
	}
}