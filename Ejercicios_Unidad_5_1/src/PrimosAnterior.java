/**
4) Dado un n�mero N que se pedir� por teclado y debe ser positivo, imprimir la lista de
todos los numero primos hasta dicho n�mero incluido.
Hacer este programa usando el m�todo primo que ya ten�is construido.
 */

import java.util.Scanner;
public class PrimosAnterior {
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
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame un n�mero positivo");
		int numero=teclado.nextInt();
		boolean primo;
		
		if(numero<0) {
			System.out.println("El n�mero no puede ser negativo");
		}
		else {
			for( int i=1;i<=numero;i++) {
				 primo = esPrimo(i); //MUY IMORTANTE INVOCAR EL M�TODO NO EN EL N�MERO SINO DONDE QUIERES QUE LO REALICE, OSEA QUE INVOCAR EL M�TODO EN EL NUMERO NO ES OBLIGATORIO
				 
				 if(primo) {
					 System.out.println("El n�mero "+ i + " es primo");
				 }
				
			}
		}
	}

}
