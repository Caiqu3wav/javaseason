package collage.lista5;
import java.util.Scanner;

public class JornadaTrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadasNoMes = scanner.nextInt();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        // Constantes
        int horasSemana = 40;
        int semanasNoMes = 4;
        int horasContratuaisNoMes = horasSemana * semanasNoMes;

        double salarioBase = 0.0;
        double bonusHoraExtra = 0.0;
        double salarioTotal = 0.0;

        if (horasTrabalhadasNoMes <= horasContratuaisNoMes) {
            // Sem horas extras
            salarioBase = horasTrabalhadasNoMes * salarioPorHora;
            salarioTotal = salarioBase;
        } else {
            // Com horas extras
            int horasExtras = horasTrabalhadasNoMes - horasContratuaisNoMes;
            salarioBase = horasContratuaisNoMes * salarioPorHora;
            double valorHoraExtra = salarioPorHora * 1.5;
            bonusHoraExtra = horasExtras * valorHoraExtra;
            salarioTotal = salarioBase + bonusHoraExtra;
        }

        // Saída do resultado
        System.out.printf("Salário total do funcionário: R$ %.2f\n", salarioTotal);

        scanner.close();
    }
}
