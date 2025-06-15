package collage.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class VerificaValorProduto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque o preço do produto");
        double preco1 = scan.nextInt();

        System.out.println("Coloque o preço do Segundo produto");
        double preco2 = scan.nextInt();
        double precosInclusos = preco1 + preco2;

        if (precosInclusos > 0 && precosInclusos < 1000){
            System.out.println(preco1 > preco2 ? "O produto 1 é o mais barato" : "O produto 2 é o mais barato");
        } else {
            throw new IllegalArgumentException("Número inválido");
        }
    }
}
