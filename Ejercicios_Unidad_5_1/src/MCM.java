/**
6) Escribir un método que reciba dos parámetros enteros p y q y devuelva el mínimo
común múltiplo de ambos.
 */
import java.util.Scanner;
public class MCM {
	static int mcm(int numero1, int numero2) {
			
		int max,min;
		if(numero1<=numero2){max=numero1; min=numero2;}  //Eliges cual es el numeor mayor y menor
		else{ max=numero1; min=numero2;}
		return (max/MCD.elMCD(numero1, numero2)*min);  //formula para sacar el mcm con el mcd
	}
	

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame un número");
		int numero1=teclado.nextInt();
		System.out.println("Dame otro número");
		int numero2=teclado.nextInt();
		
		int contadorMcm=mcm(numero1,numero2);
		
		System.out.println("El minimo común múltiplo de esos numeros es: " + contadorMcm);

	}

}
