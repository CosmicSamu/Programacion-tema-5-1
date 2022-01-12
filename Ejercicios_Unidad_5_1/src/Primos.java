/**
1) Hacer un programa que lea un n�mero N y nos escriba en la pantalla, mediante un
mensaje, si es o no primo (NOTA: N�mero primo es aqu�l que es divisible solo por
s� mismo y por la unidad)
Desarrollar este programa creando un m�todo llamado primo que devuelva true
si el n�mero es primo y false si no lo es
 */

import java.util.Scanner;
public class Primos {
static boolean esPrimo (int numero) {
		
		boolean primo = true;
		
		for (int i = 2; i < numero ; i++) { // Divido el numero dado entre todos los numeros entre 2 y el anterior al numero
			if (numero % i == 0) { // Si en alg�n momento, el resto da 0, el numero no es primo
				primo = false;
			}
		}
		return primo;
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero entero.");
		int numero = teclado.nextInt();
		boolean primo;
		
		//Invocamos el metodo
		primo = esPrimo (numero);
		
		if(primo) {
			System.out.println("El n�mero es primo");
	}
		else {
			System.out.println("El n�mero no es primo");
		}
	}
}
	