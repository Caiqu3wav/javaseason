package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ex21 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque a quantidade");
		int qtd = scan.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int soma = 0;

		for(int i = 0; i < qtd; i++) {
			System.out.println("Coloque o numero "+ i);
			int n = scan.nextInt();
			numbers.add(n);
			soma += n;
			}
		System.out.println("Maior: "+ Collections.max(numbers) + " Media: " + soma / qtd);
	}
}

