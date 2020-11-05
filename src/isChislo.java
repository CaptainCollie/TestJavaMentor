public class isChislo {
    public final static String[] rimChislo = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    public final static String[] arabChislo = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};



    public static int isPervoeChislo(String s){
        char[] chars = s.toCharArray();
        int a = 0;
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
            if (n == 1 && chislo.equals(arabChislo[j]))
                a = j+1;
        }
        for (int j = 0; j < rimChislo.length; j++) {
            if (n == 1 && chislo.equals(rimChislo[j]))
            {
                a = j+1;
            }
        }
        return a;
    }

    public static int isVtoroeChislo(String s){
        char[] chars = s.toCharArray();
        int a = 0;
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
            if (n == 2 && chislo.equals(arabChislo[j]))
                a = j+1;

        }
        for (int j = 0; j < rimChislo.length; j++) {
            if (n == 2 && chislo.equals(rimChislo[j]))
            {
                a = j+1;
            }
        }
        return a;
    }

}
