/**
8) Dados m elementos de un conjunto que se desean agrupar de n en n, el número de
combinaciones posibles es m!/(n!*(m-n)!), siendo siempre m >=n (hay que validarlo)
Escribir un método para que, dados como parámetros m y n, nos calcule el número
de combinaciones de m sobre n. Usad el método factorial del ejercicio 3.
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
		System.out.println("Dame un número");
		int m=teclado.nextInt();
		System.out.println("Dame otro número");
		int n=teclado.nextInt();
		
		int resultado=Combinaciones(m,n);
		
		System.out.println("Las combinaciones de " + m +" Sobre " + n +" es " + resultado);
	}

}
