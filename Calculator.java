package AlfaCalc;

import java.io.IOException;
import java.util.Scanner;

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
    Scanner scanner = new Scanner(System.in);
    String s1 = scanner.nextLine();
    String s2 = s1.replaceAll("\\s+", "");
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

    void subString1() {

        for (int i = 0; i < s2.length(); i++) {
            char c1;
            c1 = s2.charAt(i);
            if (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/') {
                s3 = s2.substring(0, i);
            }
        }
    }

    void subString2() {
        for (int i = 0; i < s2.length(); i++) {
            char c1;
            c1 = s2.charAt(i);
            if (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/') {
                s4 = s2.substring(i + 1);

            }
        }
    }

    public void result1() throws IOException {
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
                    System.out.println(result1);

                } else if (c1 == '-') {
                    result1 = c - d;
                    System.out.println(result1);

                } else if (c1 == '*') {
                    result1 = c * d;
                    System.out.println(result1);

                } else if (c1 == '/') {
                    result1 = c / d;
                    System.out.println(result1);

                }

            }
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new IOException();
        } else {
            throw new IOException();
        }

    }

    public static void main(String[] args) {
        Calculator r = new Calculator();
        r.subString1();
        r.subString2();
        try {
            r.ab1();
            r.ab2();
            r.cd1();
            r.cd2();
            r.result1();
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }  catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
