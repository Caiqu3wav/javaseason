package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;

public class Soma10Valores {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque o número");
		int soma = 0;
		
		for(int i = 1; i < 10; i++){
			System.out.println("número "+ i);
			int n = scan.nextInt();
			soma += n;
		}
		System.out.println("soma: "+ soma);
	}
}

