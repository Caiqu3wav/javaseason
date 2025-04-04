package collage.exercicios_condiçãop;

import java.util.Scanner;

public class AprovadoReprovado  {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Digite sua nota");
		nota = scanner.nextInt();
		
		if (nota >= 0 && nota <= 10) {
				if (nota < 6) {
					System.out.println("Reprovado");
				} else {
					System.out.println("Aprovado");
				}
		} else {
			System.out.println("Número invalido");
		}
	}
}

