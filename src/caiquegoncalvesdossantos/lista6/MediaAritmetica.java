package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;
import java.util.ArrayList;

public class MediaAritmetica {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque o número");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 1; i < 10; i++){
			System.out.println("número "+ i);
			int n = scan.nextInt();
			numbers.add(n);
		}
		
		for (int n : numbers) {
			if(n >= 10 && n <= 20) {
				System.out.println("media aritmetica deles: "+ n);
			}
		}
	}
}

