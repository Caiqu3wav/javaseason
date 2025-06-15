import java.util.Scanner;

public class Notas17 {
	
	public static void main (String[] args) {
		String SOuN = "s";
	   while(SOuN.equals("s")){	
		Scanner scan = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);
		System.out.println("Coloque a nota 1a");
		int nota1a = scan.nextInt();
		System.out.println("Coloque a nota 2a");
		int nota2a = scan.nextInt();
		if (nota1a < 0 || nota1a > 10 || nota2a < 0 || nota2a > 10){
			throw new IllegalArgumentException("notas tem que ser entre 0 e 10");
		}
		int media = (nota1a + nota2a) / 2;
		
		System.out.println("Média é: "+ media);
		System.out.println("NOVO CaLCULO? (S/N)");
		SOuN = scanStr.nextLine();
	  }
	}
}
