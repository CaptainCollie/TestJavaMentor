public class inRim {

    public static String inRim(int a) {
        String otvet = "";
        if (a == 0)
            return "nihil";
        while (a > 0) {
            if (a > 0) {
                if (a == 100) {
                    otvet += "C";
                    a %= 100;
                }
                if (a >= 90) {
                    otvet += "XC";
                    a %= 10;
                }
                if (a >= 80) {
                    otvet += "LXXX";
                    a %= 10;
                }
                if (a >= 70) {
                    otvet += "LXX";
                    a %= 10;
                }
                if (a >= 60) {
                    otvet += "LX";
                    a %= 10;
                }
                if (a >= 50) {
                    otvet += "L";
                    a %= 10;
                }
                if (a >= 40) {
                    otvet += "XL";
                    a %= 10;
                }
                if (a >= 30) {
                    otvet += "XXX";
                    a %= 10;
                }
                if (a >= 20) {
                    otvet += "XX";
                    a %= 10;
                }
                if (a >= 10) {
                    otvet += "X";
                    a %= 10;
                }
                if (a >= 9) {
                    otvet += "IX";
                    a -= 9;
                }
                if (a >= 5) {
                    otvet += "V";
                    a -= 5;
                }
                if (a >= 4) {
                    otvet += "IV";
                    a -= 4;
                }
                if (a >= 1) {
                    otvet += "I";
                    a -= 1;
                }
            } else {
                otvet += "-";
                if (a == 100) {
                    otvet += "C";
                    a %= 100;
                }
                if (a >= 90) {
                    otvet += "XC";
                    a %= 10;
                }
                if (a >= 80) {
                    otvet += "LXXX";
                    a %= 10;
                }
                if (a >= 70) {
                    otvet += "LXX";
                    a %= 10;
                }
                if (a >= 60) {
                    otvet += "LX";
                    a %= 10;
                }
                if (a >= 50) {
                    otvet += "L";
                    a %= 10;
                }
                if (a >= 40) {
                    otvet += "XL";
                    a %= 10;
                }
                if (a >= 30) {
                    otvet += "XXX";
                    a %= 10;
                }
                if (a >= 20) {
                    otvet += "XX";
                    a %= 10;
                }
                if (a >= 10) {
                    otvet += "X";
                    a %= 10;
                }
                if (a >= 9) {
                    otvet += "IX";
                    a -= 9;
                }
                if (a >= 5) {
                    otvet += "V";
                    a -= 5;
                }
                if (a >= 4) {
                    otvet += "IV";
                    a -= 4;
                }
                if (a >= 1) {
                    otvet += "I";
                    a -= 1;
                }
            }
        }
        return otvet;
    }
}
