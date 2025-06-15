package collage.lista4;

public class AprovadoReprovado {
    public static void main(String[] args) {
        double nota = Math.random() * 10;
        System.out.println(String.format("%.2f", nota));
        System.out.println(nota > 6 ? "Aprovado" : "Reprovado");
    }
}
