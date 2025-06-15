package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ex20 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque os números");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++) {
			System.out.println("Coloque o numero "+ i);
			int n = scan.nextInt();
			numbers.add(n);
			}
		System.out.println("Maior: "+ Collections.max(numbers) + " Menor: " + Collections.max(numbers));
	}
}

