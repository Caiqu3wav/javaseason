package projects;

public class DoubleChar {

    public static String doDoubleChar(String s) {
        char[] sArray = s.toCharArray();

        char[] dupSArray = new char[sArray.length * 2];

            for (int i = 0; i < sArray.length; i++) {
                char sameChar = sArray[i];
                dupSArray[2 * i] = sameChar;
                dupSArray[2 * i + 1] = sameChar;
            }

        return new String(dupSArray);
    }

    public static void main(String[] Args) {
        String word = "abacate";
        System.out.println(doDoubleChar(word));

    }
}
