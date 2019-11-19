import java.util.Scanner;

public class MenuakGit {
	static final int SALIR = 0;
	static final int SUMAR = 1;
	static final int RESTAR = 2;
	static final int MULTIPLICAR = 3;
	static final int DIVIDIR = 4;
	static final int FACTORIAL = 5;

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num = 0;

		int numero1 = 0;
		int numero2 = 0;
        int num3;
		double numero3 = 0.0;
		double numero4 = 0.0;
		
		
		
		
		do {

			System.out.println("seleccione una categoria");

			System.out.println("0 - Salir");
			System.out.println("1 - Sumar");
			System.out.println("2 - Restar");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("5 - Factorial");
			num = teclado.nextInt();

		} while (SALIR != 0);

		switch (num) {

		case SALIR:
			System.out.println("Salir del programa");
			break;

		case SUMAR:
			int resultadosuma = 0;
			resultadosuma = numero1 + numero2;
            System.out.println("Introduce un numero");
			numero1 = teclado.nextInt();
			System.out.println("Introduce otro numero");
			numero2 = teclado.nextInt();

			System.out.println("La suma de los dos numeros es :" + resultadosuma);

			break;

		case RESTAR:

			int resultadoresta = 0;
			resultadoresta = numero1 - numero2;
			System.out.println("Introduce un numero");
			numero1 = teclado.nextInt();
			System.out.println("Introduce otro numero para restar el primero");
			numero2 = teclado.nextInt();
			System.out.println("La resta de los dos numeros es: " + resultadoresta);
			break;

		case MULTIPLICAR:
			System.out.println("Introduce un numero");
			numero1 = teclado.nextInt();
			System.out.println("Introduce otro numero para multiplicar el primero");
			numero2 = teclado.nextInt();
			System.out.println("La multiplicación de los dos numeros es: " + numero1 * numero2);

			break;

		case DIVIDIR:
			System.out.println("Introduce un numero");
			numero3 = teclado.nextInt();
			System.out.println("Introduce otro numero para dividir el número");
			numero4 = teclado.nextInt();
			System.out.println("La división de los dos numeros es: " + numero3 / numero4);

			break;
			
			
		case FACTORIAL:
			
			long factorial=1;
	        
	        System.out.print("Introduce un número: ");
	        numero1 = teclado.nextInt();
	        for (int i = numero1; i > 0; i--) {
	            factorial = factorial * i;
	        }
	        System.out.println("El factorial de " + numero1 + " es: " + factorial);
	    }
			

			
			
			
			
		}

	}

