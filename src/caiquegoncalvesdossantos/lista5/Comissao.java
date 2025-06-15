package collage.lista5;

import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o salário fixo: ");
        int salarioFixo = scanner.nextInt();


        System.out.print("Digite o valor das vendas: ");
        double valorVendas = scanner.nextDouble();
        double valorComissao = 0.00;

        if (valorVendas > 1500) {
            valorComissao += (valorVendas * 1.3) * 1.5;
        } else {
            valorComissao += valorVendas * 1.3;
        }
    }
}
