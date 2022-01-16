/**
8) Dados m elementos de un conjunto que se desean agrupar de n en n, el n�mero de
combinaciones posibles es m!/(n!*(m-n)!), siendo siempre m >=n (hay que validarlo)
Escribir un m�todo para que, dados como par�metros m y n, nos calcule el n�mero
de combinaciones de m sobre n. Usad el m�todo factorial del ejercicio 3.
 */
import java.util.Scanner;	
public class Numero_Combinaciones {
	static int Combinaciones(int m,int n) {
		int resultado;
		resultado=Factorial.factorial(m)/(Factorial.factorial(n)*(Factorial.factorial(m-n)));
		return resultado;
	}


	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame un n�mero");
		int m=teclado.nextInt();
		System.out.println("Dame otro n�mero");
		int n=teclado.nextInt();
		
		int resultado=Combinaciones(m,n);
		
		System.out.println("Las combinaciones de " + m +" Sobre " + n +" es " + resultado);
	}

}
