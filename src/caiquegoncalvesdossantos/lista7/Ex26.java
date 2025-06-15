package caiquegoncalvesdossantos.lista7;

import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class Ex26 {
    public static void main(String[] args){
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(100);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 100; i++) {
            sb.append(alphabet.charAt(rand.nextInt(alphabet.length())));
        }

        String str = sb.toString();
        System.out.println("String gerada: " + str);

        Set<Character> letrasNaString = new HashSet<>();
        for (char c : str.toCharArray()) {
            letrasNaString.add(c);
        }

        System.out.print("Letras que NÃO aparecem: ");
        boolean algumaAusente = false;
        for (char c : alphabet.toCharArray()) {
            if (!letrasNaString.contains(c)) {
                System.out.print(c + " ");
                algumaAusente = true;
            }
        }
        if (!algumaAusente) {
            System.out.print("Nenhuma letra ausente");
        }
        System.out.println();

        String maiorSeqRepetidas = "";
        String atualSeqRepetidas = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                atualSeqRepetidas += str.charAt(i);
            } else {
                if (atualSeqRepetidas.length() > maiorSeqRepetidas.length()) {
                    maiorSeqRepetidas = atualSeqRepetidas;
                }
                atualSeqRepetidas = "" + str.charAt(i);
            }
        }
        if (atualSeqRepetidas.length() > maiorSeqRepetidas.length()) {
            maiorSeqRepetidas = atualSeqRepetidas;
        }

        System.out.println("Maior sequência de letras repetidas: " + maiorSeqRepetidas);

        String vogais = "aeiou";
        String maiorSeqVogais = "";
        String atualSeqVogais = "";
        for (char c : str.toCharArray()) {
            if (vogais.indexOf(c) >= 0) {
                atualSeqVogais += c;
                if (atualSeqVogais.length() > maiorSeqVogais.length()) {
                    maiorSeqVogais = atualSeqVogais;
                }
            } else {
                atualSeqVogais = "";
            }
        }
        System.out.println("Maior sequência de vogais: " + maiorSeqVogais);

        String maiorSeqAlfabetica = "";
        String atualSeqAlfabetica = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) >= str.charAt(i - 1)) {
                atualSeqAlfabetica += str.charAt(i);
            } else {
                if (atualSeqAlfabetica.length() > maiorSeqAlfabetica.length()) {
                    maiorSeqAlfabetica = atualSeqAlfabetica;
                }
                atualSeqAlfabetica = "" + str.charAt(i);
            }
        }

        if (atualSeqAlfabetica.length() > maiorSeqAlfabetica.length()) {
            maiorSeqAlfabetica = atualSeqAlfabetica;
        }

        System.out.println("Maior sequência alfabética: " + maiorSeqAlfabetica);
    }
}
