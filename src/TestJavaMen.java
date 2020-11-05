import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestJavaMen {


    public static void main(String[] args) throws IOException {

        String s = enterString();
        int a = isChislo.isPervoeChislo(s);
        int b = isChislo.isVtoroeChislo(s);
        if (ProverkanaTip.Proverka1Chislo(s) == 1)
            System.out.println(Znak.Znak(s, a, b));
        else
            System.out.println(inRim.inRim(Znak.Znak(s, a, b)));

    }

    public static String enterString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            s = reader.readLine();
            if (s.isEmpty())
                System.out.println("Введите выражение");
            else if (ProverkanaTip.Proverka(s))
                break;
            else {
                System.out.println("Неверный формат");
            }
        }
        return s;
    }
}

