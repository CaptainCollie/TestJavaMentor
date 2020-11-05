import java.sql.SQLOutput;
import java.util.SortedMap;

public class Znak {

    public static int Znak(String s, int a, int b){
        char[] chars = s.toCharArray();
        String znak = "";
        int n = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                n++;
            else
            if (n < 2 && chars[i] != ' ' && n > 0)
                znak +="" + chars[i];
        }
        if (znak.equals("+"))
            return a+b;
        if (znak.equals("-"))
            return a-b;
        if (znak.equals("*"))
            return a*b;
        if (znak.equals("/"))
            return a/b;
        else
            return 0;
    }
}
