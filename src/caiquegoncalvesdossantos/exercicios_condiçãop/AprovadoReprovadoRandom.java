package collage.exercicios_condiçãop;

import java.util.Scanner;

public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
				
		System.out.println("Qual a sua nota ?");
		nota = scan.nextInt();
		
		if (nota < 6) {
			System.out.println("Reprovado");
		} 
		else {
			System.out.println("Aprovado");
		}
	}
}
