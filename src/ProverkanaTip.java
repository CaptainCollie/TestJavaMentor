public class ProverkanaTip {
    public final static String[] rimChislo = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    public final static String[] arabChislo = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};


    public static int Proverka1Chislo(String s){
        char[] chars = s.toCharArray();
        int a = 0;
        int q =0;
        String chislo = "";
        int n = 0;
        for (int i = 0; i < chars.length; i++) {
            if (n == 1)
                break;
            if (chars[i] == ' ')
                n++;
            else
            if (n < 1 && chars[i] != ' ')
                chislo +="" + chars[i];
        }
        for (int j = 0; j < arabChislo.length; j++) {
            if (n == 1 && chislo.equals(arabChislo[j])) {
                a++;
            }
        }
        for (int j = 0; j < rimChislo.length; j++) {
            if (n == 1 && chislo.equals(rimChislo[j]))
            {
                q++;
            }
        }
        if (a == 1)
            return 1;
        else
            if (q == 1)
            return 2;
            else
                return 0;
    }
    public static int Proverka2Chislo(String s){
        char[] chars = s.toCharArray();
        int a = 0;
        int q =0;
        String chislo = "";
        int n = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                n++;
            else
            if (n == 2 && chars[i] != ' ')
                chislo +="" + chars[i];
        }
        for (int j = 0; j < arabChislo.length; j++) {
            if (n == 2 && chislo.equals(arabChislo[j])) {
                a++;
            }
        }
        for (int j = 0; j < rimChislo.length; j++) {
            if (n == 2 && chislo.equals(rimChislo[j]))
            {
                q++;
            }
        }
        if (a == 1)
            return 1;
        else
        if (q == 1)
            return 2;
        else
            return 3;
    }

    public static boolean Proverka(String s){
        if (Proverka1Chislo(s) == Proverka2Chislo(s))
            return true;
        else
            return false;
    }

}
