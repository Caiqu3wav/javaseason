import java.util.Scanner;

public class Loja19 {
	
	public static void main (String[] args) {
		String SOuN = "s";
	   while(SOuN.equalsIgnoreCase("s")){	
		Scanner scan = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);
		System.out.println("Coloque o numero de mercadorias");
		int estoque = scan.nextInt();
		int soma = 0;

		for (int i = 0; i < estoque; i++) {
			System.out.println("Coloque o preco da mercadoria "+ i);
			int preco = scan.nextInt();
			soma += preco;
		}
		System.out.println("Produtos em estoque: "+ estoque + 
		" media dos precos: "+ soma / estoque);
		System.out.println("MAIS MERCADORIAS? (S/N)");
		SOuN = scanStr.nextLine();
	  }
	}
}

