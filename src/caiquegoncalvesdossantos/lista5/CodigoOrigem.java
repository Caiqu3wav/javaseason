import java.util.Scanner;

public class CodigoOrigem {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int codigoOrigem;
		int preco;
		
		System.out.println("Insira o preço do produto");
		preco = scanner.nextInt();
		
		System.out.println("Insira o código de origem");
		codigoOrigem = scanner.nextInt();
		
		switch(codigoOrigem) {
			case 1:
				System.out.println("Norte");
				break;
			case 2:
			case 5:
			case 9:
				System.out.println("Sul");
				break;
			case 7:
			case 20:
				System.out.println("Oeste");
				break;
			case 3:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				System.out.println("Leste");
				break;
			
			default:
				System.out.println("Importado");
		}
	}
}

