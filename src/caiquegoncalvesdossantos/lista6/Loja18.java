package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;

public class Loja18 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque o numero de mercadorias");
		int estoque = scan.nextInt();
		int soma = 0;

		for (int i = 0; i < estoque; i++) {
			System.out.println("Coloque o numero de mercadorias");
			int preco = scan.nextInt();
			soma += preco;
		}
		System.out.println("Produtos em estoque: "+ estoque + 
		" media dos precos: "+ soma / estoque);
	  }
	}