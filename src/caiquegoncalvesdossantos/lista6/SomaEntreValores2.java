package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;

public class SomaEntreValores2 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque o número 1");
		int n1 = scan.nextInt();
		System.out.println("Coloque o número 2");
		int n2 = scan.nextInt();
		int maior = Math.max(n1, n2);
		int menor = Math.min(n1, n2);
		int soma = maior; 
		
		do {
			soma += menor;
			menor++;
		} while(menor < maior);
		
		System.out.println("soma deles entre os numeros: "+ soma);
	}
}

