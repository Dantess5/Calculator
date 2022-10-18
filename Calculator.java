package AlfaCalc;

import java.io.IOException;
import java.util.Scanner;

import static AlfaCalc.Main.calc;

public class Calculator {
    int a;
    int b;
    int c;
    int d = 0;
    String[] array = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] array2 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    String s3;
    String s4;
    String resrim;

    void ab1() {

        for (int i = 0; i < array.length; i++) {
            if (s3.equals(array[i])) {
                a = i + 1;

            }
        }
    }

    void cd1() {
        if (a == 0) {
            c = Integer.parseInt(s3);
        }
    }

    void ab2() {
        for (int i = 0; i < array.length; i++) {
            if (s4.equals(array[i])) {
                b = i + 1;
            }
        }
    }

    void cd2() {
        if (b == 0) {
            d = Integer.parseInt(s4);
        }
    }

    void subString1(String sS) {

        for (int i = 0; i < sS.length(); i++) {
            char c1;
            c1 = sS.charAt(i);
            if (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/') {
                s3 = sS.substring(0, i);
            }
        }
    }

    void subString2(String sS) {
        for (int i = 0; i < sS.length(); i++) {
            char c1;
            c1 = sS.charAt(i);
            if (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/') {
                s4 = sS.substring(i + 1);

            }
        }
    }

    public String result1(String s2) throws IOException {

        int result1 = 0;
        char c2;
        if (a != 0 && b != 0) {
            for (int i = 0; i < s2.length(); i++) {
                c2 = s2.charAt(i);
                if (c2 == '+') {
                    result1 = a + b;

                } else if (c2 == '-') {
                    result1 = a - b;

                } else if (c2 == '*') {
                    result1 = a * b;

                } else if (c2 == '/') {
                    result1 = a / b;

                }
            }
            if (result1 > 0) {
                for (int i = 0; i < array2.length; i++) {
                    if (result1 == i) {
                        resrim = array2[i];
                        return resrim;
                    }
                }
                System.out.println(resrim);
            } else {
                throw new IOException();

            }
        } else if (a == 0 && b == 0 && c < 11 && d < 11) {
            char c1;
            for (int i = 0; i < s2.length(); i++) {
                c1 = s2.charAt(i);
                if (c1 == '+') {
                    result1 = c + d;
                    s2 = String.valueOf(result1);
                    return s2;

                } else if (c1 == '-') {
                    result1 = c - d;
                    s2 = String.valueOf(result1);
                    return s2;

                } else if (c1 == '*') {
                    result1 = c * d;
                    s2 = String.valueOf(result1);
                    return s2;

                } else if (c1 == '/') {
                    result1 = c / d;
                    s2 = String.valueOf(result1);
                    return s2;

                }

            }
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new IOException();
        } else {
            throw new IOException();
        }
        return s2;
    }


}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        calc(s1);
        scanner.close();

    }
    public static String calc(String input) {
        String s2 = input.replaceAll("\\s+", "");
        Calculator r = new Calculator();
        r.subString1(s2);
        r.subString2(s2);
        try {
            r.ab1();
            r.ab2();
            r.cd1();
            r.cd2();
            input = r.result1(s2);
            System.out.println(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }  catch (IOException e) {
            throw new RuntimeException();
        }
        return input;
    }
}