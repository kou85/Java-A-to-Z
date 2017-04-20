package ua.ikonovalov.Bracket;

/**
 * Created by Strong on 20.04.17.
 */
public class Bracket {
    public boolean testBracket(String symbolLine) {
        String[] origin = symbolLine.split("");
        boolean result = false;
        int condition = 0;
        for (String symbol : origin) {
            if (symbol.equals("(")) {
                condition++;
            } else if (symbol.equals(")")) {
                if (--condition < 0) {
                    result = false;
                    break;
                }
            }
            if (condition == 0) {
                result = true;
            }
        }
        return result;
    }
}


