package projects;

import java.util.HashMap;
import java.util.Map;

public class PedraPapelTesoura {
static abstract class Hand {
 public abstract String Action();
}

static class Scissors extends Hand {
    @Override
    public String Action() {
    return "cortar";
  }
}

    static class Rock extends Hand {
    @Override
    public  String Action(){
         return "quebrar";
     }
}

    static class Lizard extends Hand {
    @Override
    public  String Action(){
        return "envenenar";
    }
}

    static class Paper extends Hand {
    @Override
    public  String Action(){
        return "cobrir";
    }
}

    static class Spock extends Hand {
     @Override
    public  String Action(){
        return "vaporizar";
    }
}

     private static Map<String, Hand> handMap = new HashMap<>();

    static {
        handMap.put("tesoura", new Scissors());
        handMap.put("pedra", new Rock());
        handMap.put("papel", new Paper());
        handMap.put("lagartixa", new Lizard());
        handMap.put("spock", new Spock());
    }
 public static String rpsls(String player1, String player2) {
        Hand hand1 = handMap.get(player1.toLowerCase());
        Hand hand2 = handMap.get(player2.toLowerCase());

     if (hand1 == null || hand2 == null) {
         return "Invalid input!";
     }

        String[] actions = new String[] {hand1.Action(), hand2.Action()};

     if ((actions[0].equals("cortar") && (actions[1].equals("cobrir") || actions[1].equals("envenenar"))) ||
             (actions[0].equals("quebrar") && (actions[1].equals("cortar") || actions[1].equals("envenenar"))) ||
             (actions[0].equals("cobrir") && (actions[1].equals("quebrar") || actions[1].equals("vaporizar"))) ||
             (actions[0].equals("envenenar") && (actions[1].equals("cobrir") || actions[1].equals("vaporizar"))) ||
             (actions[0].equals("vaporizar") && (actions[1].equals("cortar") || actions[1].equals("quebrar")))) {
         return "Player 1 won!";
     } else if (actions[0].equals(actions[1])) {
         return "Draw!";
     } else {
         return "Player 2 won!";
     }
 }


 public static void main(String[] args) {
        String player1 = "tesoura";
        String player2 = "pedra";

        System.out.println(rpsls(player1, player2));
 }
}