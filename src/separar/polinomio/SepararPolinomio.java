package separar.polinomio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SepararPolinomio {

    public static void main(String[] args) {

        String exp = "2x^3+4x^2+5x-42";
        Pattern pattern = Pattern.compile("((?:(?:\\d+\\d+)|(?:\\d+)))");
        Matcher matcher = pattern.matcher(exp);
        int x = 0;
        while (matcher.find()) {
            x = x + 1;
            System.out.println("Group " + x + ": " + matcher.group(1));
        }

    }

}
