public class Media15E100 {
	
	public static void main (String[] args) {
		int qtd = 0;
		int soma = 0;
		for(int i = 15; i < 100; i++) {
			qtd++;
			soma += i;
		}
		  System.out.println("Média: "+ soma / qtd);
	}
}

