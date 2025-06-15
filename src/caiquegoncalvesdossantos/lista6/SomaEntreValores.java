package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;

public class SomaEntreValores {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque o número 1");
		int n1 = scan.nextInt();
		System.out.println("Coloque o número 2");
		int n2 = scan.nextInt();
		int soma = n2;
		
		if (n1 >= n2) {
			throw new IllegalArgumentException("número 1 tem que ser menor");
		}
		
		do {
			soma += n1;
			n1++;
		} while(n1 < n2);
		
		System.out.println("soma deles entre os numeros: "+ soma);
	}
}
