package projects;

import java.util.Scanner;

class Equacao2Grau {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c = 0;
		double delta = 0;
		double x1, x2 = 0;
		
		System.out.println("Entre com o valor de \'a\': ");
		a = scanner.nextInt();
		
		if (a == 0) {
		    throw new IllegalArgumentException("A igual a zero, Input inválido");
		} 
		    System.out.println("Entre com o valor de \'b\': ");
			b = scanner.nextInt();
			System.out.println("Entre com o valor de \'c\': ");
			c = scanner.nextInt();
			
			delta = Math.pow(b, 2) - 4 * (a * c);
			
			System.out.println("\nValor de delta: " + (int)delta);
			
			
			if (delta > 0) {
			x1 = (-b + Math.sqrt(a)) / (2 * a);
			x2 = (-b - Math.sqrt(a)) / (2 * a);
			System.out.println("\nValor de x1: " + (int)x1);
			System.out.println("Valor de x2: " + (int)x2);
		}   else if(delta == 0) {
				x1 = -b / (2.0 * a);
				System.out.println("\nValor de x: " + (int)x1);
		}	else {
				System.out.println("\n\tNaum existem raízes reais\n");
		}
	}
}
