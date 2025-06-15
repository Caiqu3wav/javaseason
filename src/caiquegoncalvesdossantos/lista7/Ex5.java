package caiquegoncalvesdossantos.lista7;

public class Ex5 {
    public static void main(String[] args){
        String frase = "amoeba e banana";

        System.out.println(QuantosA(frase));
    }

    public static int QuantosA(String frase){
        int count = 0;

        for(int i = 0; i < frase.length(); i++){
            char[] fraseIndex = frase.toCharArray();
            if (fraseIndex[i] == 'a') count++;
        }
        return count;
    }
}
