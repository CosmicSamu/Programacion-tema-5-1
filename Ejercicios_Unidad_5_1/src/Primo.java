
import java.util.Scanner;
class Primo{
	static boolean Primo(int numero) {
	boolean primo= true;
		for (int i = 2; i < numero ; i++) {
			if (numero % i == 0) {
				primo=false;
			}
		}
		return primo;
	}
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame un número");
		int numero=teclado.nextInt();
		boolean primo;
		
		primo=Primo(numero);	//invocamos el método
	
		System.out.println("El numero " + numero + (primo ? "" : " no") + " es primo.");
}
	
}



