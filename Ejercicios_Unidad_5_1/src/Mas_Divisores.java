/**
2) Dados dos n�meros P y Q que leeremos por teclado y que deben ser positivos, hacer
un programa que nos diga cu�l de los dos tiene m�s divisores, con un mensaje que
diga �P tiene m�s divisores que Q� o viceversa.
Este programa debe llamar a un m�todo que calcule los divisores de un n�mero,
lo aplique para P y para Q y luego compare y decida.
 */

import java.util.Scanner;
public class Mas_Divisores {

	static boolean masDivisores(int numeroP, int numeroQ,int contadorP, int contadorQ) { //Ceamos el m�todo con los int que queremos que participen
		boolean masDivisoresP =true;
			for(int i=2;i<numeroP;i++) {
				if(numeroP % i ==0) {
					contadorP++;
				}
			}
			for(int i=2;i<numeroQ;i++) {
				if(numeroQ % i ==0) {
					contadorQ++;
		}
	}
			if(contadorP<contadorQ) {
				masDivisoresP=false;
			}
			return masDivisoresP;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero positivo");
		int numero1=teclado.nextInt();
		System.out.println("Dame otro n�mero positivo");
		int numero2=teclado.nextInt();
		int contadorP=0;
		int contadorQ=0;
		boolean masDivisoresP; // ncesitamos siempre crear una variable con igual nombre del m�todo para podr invocarlo
		
		if(numero1>0 && numero2>0) {   //si los dos n�meros son mayores que 0 invocamos el m�todo
			masDivisoresP=masDivisores(numero1,numero2,contadorP,contadorQ);    //la invocaci� se hace siempre el nombre de la variable important es igual al nimbre del m�todo y los participantes
			if(masDivisoresP) {
				System.out.println( numero1 + " tiene m�s divisores que " + numero2);
			}
			else {
				System.out.println(numero2 + " tiene m�s divisores que " + numero1);
			}
		}
		else {
			System.out.println("Los n�meros intoducidos no son v�lidos");
		}
	}

}
