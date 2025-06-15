package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;

public class Tabuada {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque o número");
		int n = scan.nextInt();

		for(int i = 0; i < 10; i++) {
			System.out.println(n+ " Vezes "+ i + " = "+ i * n);
		}
	}
}


