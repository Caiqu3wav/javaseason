package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;

public class Soma10Valores40 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque o número");
		int soma = 0;
		
		for(int i = 1; i < 10; i++){
			System.out.println("número "+ i);
			int n = scan.nextInt();
			if (n < 40) soma += n;
		}
		System.out.println("soma menores 40: "+ soma);
	}
}
