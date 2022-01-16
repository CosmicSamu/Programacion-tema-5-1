/**
9) Escribir un programa que llame a un m�todo con los coeficientes de una ecuaci�n de
segundo grado, a, b y c, y devuelva sus ra�ces en el caso de ser reales.
Nota. Las ra�ces de una ecuaci�n son :
R1=(-b+ra�z(b2
-4*a_c))/(2*a)
R2=(-b-ra�z(b2
-4*a_c))/(2*a)
Para la ra�z llamar a la clase Math y el m�todo ra�z que es sqrt.
Esta funci�n solo se puede aplicar en el caso de que valor sea positivo es decir:
b
2
-4*a*c > 0.
 */
import java.util.Scanner;
public class Segundo_Grado {
	static int Raiz1(int a,int b,int c) {
		double raiz1 = 0;
		
		double raiz_dentro=(b*b)-4*a*c;
		
		if (raiz_dentro>0) {
			raiz1 = (-b + Math.sqrt(raiz_dentro))/(2*a);
			
		}
		else {
			System.out.println("La raiz es negativa");
		}
		return (int) raiz1;
	}
	static int Raiz2(int a,int b,int c) {
		double raiz2 = 0;
		
		double raiz_dentro=(b*b)-4*a*c;
		
		if (raiz_dentro>0) {
			raiz2 = (-b - Math.sqrt(raiz_dentro))/(2*a);
			
		}
		else {
			System.out.println("La raiz es negativa");
		}
		return (int) raiz2;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero que ser� a en la ecuaci�n de segundo grado");
		int a=teclado.nextInt();
		System.out.println("Dame un n�mero que ser� b en la ecuaci�n de segundo grado");
		int b=teclado.nextInt();
		System.out.println("Dame un n�mero que ser� c en la ecuaci�n de segundo grado");
		int c=teclado.nextInt();
		
		int raiz1=Raiz1(a,b,c);
		int raiz2=Raiz2(a,b,c);
		
		System.out.println("Los resultaos de esta ecuaci�n de segundo grado es: " + raiz1 + " ," + raiz2);
	}

}
