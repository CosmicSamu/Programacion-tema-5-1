/**
7) Escribir un método al que se le dé como parámetro un valor r, que representa el radio
de una figura, una opción: un dato entero que será 1, 2 ó 3. El método debe devolver:
 · En el caso opción 1, la longitud del circulo de radio r dada por la expresión 2*PI*r
 · En el caso opción 2, la superficie del circulo dada por la expresión PI*r2
 · En el caso opción 3, el volumen de una esfera de radio r dada por la expresión
   4/3*PI*r3
NOTA: PI es la constante 3,14159
 */
import java.util.Scanner;
public class Radio_Esfera {
	static double RadioFigura(int r,int opcion) {
		final double Pi=3.14159;
		double resultado;
		switch(opcion) {
		case 1: resultado =2*Pi*r;
		break;
		case 2: resultado=Pi*(r*r);
		break;
		case 3: resultado=(4/3)*Pi*(r*r*r);
		break;
		default:resultado=0000;
		
		}
		return resultado;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número que será el radio");
		int r=teclado.nextInt();
		System.out.println("Escribe 1 si quieres saber la lonitud del radio, 2 si quieres saber la superficie del círculo y 3 si quieres saber el volumen de la esfera.");
		int opcion=teclado.nextInt();
		
		double resultado=RadioFigura(r,opcion);
		if(r<0 || opcion > 3) {
			System.out.println("Error");
		}
		else {
			System.out.println("El resultado es: "+ resultado);
		}
		
		

	}

}
