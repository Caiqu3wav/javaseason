package collage.lista5;
import java.util.Scanner;

public class VotarOuNao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o ano atual");
        int anoAtual = scan.nextInt();
        System.out.println("Insira seu ano de nascimento");
        int anoNascimento = scan.nextInt();

        System.out.println((anoAtual - anoNascimento) > 18 ? "Pode votar" : "Não pode votar");
    }

}
