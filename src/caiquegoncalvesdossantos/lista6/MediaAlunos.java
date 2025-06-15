package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;
import java.util.ArrayList;

public class MediaAlunos {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Coloque o número de alunos");
		int alunosQtd = scan.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int soma = 0;
		
		for(int i = 1; i < alunosQtd; i++){
			System.out.println("Coloque a nota do aluno "+ i);
			int nota = scan.nextInt();
			numbers.add(nota);
			soma += nota;
		}
		
		for (int n : numbers) {
			System.out.println("media aritmetica das notas: "+ soma / numbers.size());
		}
	}
}

