package caiquegoncalvesdossantos.lista7;

public class Ex3 {
    public static void main(String[] args){
        String ascii = "";
        for(int i = 65; i <= 90; i++){
            ascii += Character.toLowerCase((char) i);
        }
        System.out.print(ascii);
    }
}
