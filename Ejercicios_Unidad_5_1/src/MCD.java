/**
5) Escribir un método que con dos parámetros enteros p y q nos devuelva el m.c.d.
(máximo común divisor) de ambos.
 */
import java.util.Scanner;
public class MCD {
	static int elMCD (int numero1,int numero2) {
		int contadorUltimo=0;
			
		for(int i=1;i<=numero1;i++) {
			if(numero1%i==0 && numero2%i==0) {
				contadorUltimo=i; //Almacenamos el ultimo digito común
			}
			
		}
		return contadorUltimo;
	}
	
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame un número");
		int numero1=teclado.nextInt();
		System.out.println("Dame otro número");
		int numero2=teclado.nextInt();
		
		int contadorUltimo=elMCD(numero1,numero2);
		
		System.out.println("El máximo común divisor de esos números es: " + contadorUltimo);
	}

}
