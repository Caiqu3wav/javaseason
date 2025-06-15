package collage.lista5;
import java.util.Scanner;

public class Calculadora {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Leitura dos dois números
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            // Leitura da operação
            System.out.print("Digite a operação (+, -, *, /): ");
            String opStr = scanner.next();
            char operacao = opStr.charAt(0); // pega o primeiro caractere da string

            double resultado;

            // Verifica qual operação realizar
            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, resultado);
                    break;
                case '-':
                    resultado = num1 - num2;
                    System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, resultado);
                    break;
                case '*':
                    resultado = num1 * num2;
                    System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, resultado);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    } else {
                        resultado = num1 / num2;
                        System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, resultado);
                    }
                    break;
                default:
                    System.out.println("Operação inválida. Utilize +, -, *, /");
            }

            scanner.close();
        }
}
