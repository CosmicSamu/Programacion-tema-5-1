/**
4) Dado un número N que se pedirá por teclado y debe ser positivo, imprimir la lista de
todos los numero primos hasta dicho número incluido.
Hacer este programa usando el método primo que ya tenéis construido.
 */

import java.util.Scanner;
public class PrimosAnterior {
static boolean esPrimo (int numero) {
		
		boolean primo = true;
		
		for (int i = 2; i < numero ; i++) { // Divido el numero dado entre todos los numeros entre 2 y el anterior al numero
			if (numero % i == 0) { // Si en algún momento, el resto da 0, el numero no es primo
				primo = false;
			}
		}
		return primo;
	}

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame un número positivo");
		int numero=teclado.nextInt();
		boolean primo;
		
		if(numero<0) {
			System.out.println("El número no puede ser negativo");
		}
		else {
			for( int i=1;i<=numero;i++) {
				 primo = esPrimo(i); //MUY IMORTANTE INVOCAR EL MÉTODO NO EN EL NÚMERO SINO DONDE QUIERES QUE LO REALICE, OSEA QUE INVOCAR EL MÉTODO EN EL NUMERO NO ES OBLIGATORIO
				 
				 if(primo) {
					 System.out.println("El número "+ i + " es primo");
				 }
				
			}
		}
	}

}
