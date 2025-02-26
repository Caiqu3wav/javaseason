package projects;

public class MergeStrings {
    public static void main(String[] args) {
        String player1 = "tesoura";
        String player2 = "pedra";

        System.out.println(mergeAlternately(player1, player2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder wordMerged = new StringBuilder();

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if(i < word1.length()) {
                wordMerged.append(word1.charAt(i));
            }

            if(i < word2.length()) {
                wordMerged.append(word2.charAt(i));
            }
        }
        return wordMerged.toString();
    }
}
