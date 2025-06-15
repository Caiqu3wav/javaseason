package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;
import java.util.ArrayList;

public class ValoresNegativos {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque os números");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 1; i < 10; i++){
			System.out.println("número "+ i);
			int n = scan.nextInt();
			numbers.add(n);
		}
		
		for(int n : numbers) {
			if (n < 0) {
			System.out.println("Negativo: "+ n);
		}
		}
	}
}

