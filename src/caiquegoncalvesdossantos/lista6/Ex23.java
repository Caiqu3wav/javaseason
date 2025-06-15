package caiquegoncalvesdossantos.lista6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex23 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque a numero de habitantes");
		int habitantes = scan.nextInt();
		
		int[] salario = new int[habitantes];
		int[] nFilhos = new int[habitantes];
		int somaSalario = 0;

		for (int i = 0; i <= habitantes; i++) {
			System.out.println("Coloque a salario");
			salario[i] = scan.nextInt();
			System.out.println("Coloque a numero de filhos");
			nFilhos[i] = scan.nextInt();
		}

		int mediaSalario = Arrays.stream(salario).sum() / habitantes;
		int mediaNFilhos = Arrays.stream(nFilhos).sum() / habitantes;
		int maiorSalario = Arrays.stream(salario).max().getAsInt();
		long salariosMenor150 = Arrays.stream(salario).filter(s -> s < 150).count();


		System.out.println("Média de salário: "+ mediaSalario +
				" Media de filhos p/habitante: " + mediaNFilhos +
				" Maior salário: "+ maiorSalario +
				" Percentual de salarios menores que R$150: " + (double)(salariosMenor150 * salario.length) / habitantes);
	}
}
