package Lecture1;

import java.util.Scanner;

public class Lecture1_8 {

    public static String onlyAlphabetToUpper(String str) {

        StringBuffer sb = new StringBuffer();
        char[] cArr = str.toCharArray();

        for (char c : cArr) {
            int code = (int) c;
            if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
                if (Character.isLowerCase(c)) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }

    public static String checkPalindrome(String str) {

        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (str.charAt(lt) == str.charAt(rt)) {
                lt++;
                rt--;
            } else {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String alpha = onlyAlphabetToUpper(input);
        String beta = checkPalindrome(alpha);
        System.out.println(beta);

    }

}
