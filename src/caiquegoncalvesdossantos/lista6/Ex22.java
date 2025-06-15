package caiquegoncalvesdossantos.lista6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex22 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque a quantidade");
		int[] precos = new int[15];
		int soma = 0;

		for(int i = 0; i < 15; i++) {
			System.out.println("Coloque o preco "+ i);
			int preco = scan.nextInt();
			soma += preco;
			}
		int max = Arrays.stream(precos).max().getAsInt();
		System.out.println("Maior: "+ max + " Media: " + soma / precos.length);
	}
}

