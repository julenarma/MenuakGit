

import java.util.Scanner;

public class MenuakGit {
	static final int SALIR = 0;
	static final int SUMAR = 1;
	static final int RESTAR = 2;
	static final int MULTIPLICAR = 3;
	static final int DIVIDIR = 4;
	
	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
    int num=0;
	
		int numero1=0;
		int numero2=0;
		double numero3=0.0;
		double numero4=0.0;
		do {	
			
			System.out.println("seleccione una categoria");

			System.out.println("0 - Salir");
			System.out.println("1 - Sumar");
			System.out.println("2 - Restar");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			num=teclado.nextInt();
			
		
  }while (SALIR!=0);
	



switch (num) {



case SUMAR:
	
	
	break;

case RESTAR:

	break;

case MULTIPLICAR:
	
	break;

	
case DIVIDIR:


	break;

}}}


