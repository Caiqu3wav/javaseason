package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;
import java.util.ArrayList;

public class Intervalo10 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque os números");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int counter = 0;
		
		for(int i = 1; i < 10; i++){
			System.out.println("número "+ i);
			int n = scan.nextInt();
			numbers.add(n);
		}
		
		for (int n : numbers) {
			if(n >= 10 && n <= 20) {
				System.out.println("número válido: "+ n);
				counter++;
			}
		}
		System.out.println("números validos: "+ counter);
	}
}

