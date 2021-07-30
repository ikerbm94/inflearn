package Lecture1;

import java.util.Scanner;

public class Lecture1_9 {

    // 숫자만 걸러내기
    public static String onlyNumber(String str) {

        StringBuffer sb = new StringBuffer();
        char[] cArr = str.toCharArray();

        for (char c : cArr) {
            int code = c - '0';
            if (code >= 0 && code <= 9) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    // 맨앞이 0이라면 없애기
    public static int toInt(String str) {

        StringBuffer sb = new StringBuffer();

        if (str.charAt(0) == 48) {
            for (int i = 1 ; i < str.length() ; i++) {
                sb.append(str.charAt(i));
            }
        } else {
            for (int i = 0 ; i < str.length() ; i++) {
                sb.append(str.charAt(i));
            }
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String alpha = onlyNumber(input);
        int beta = toInt(alpha);
        System.out.println(beta);

    }

}

// char c = '5';
// int i = c - '0';
// char를 int로 변환하는 방법

// int i1 = 65;
// int i2 = 1;
// 위의 두 가지 int를 char로 캐스팅하면 어떻게 될까?
// char c1 = (char) i1;
// char c2 = (char) i2;
// sout으로 찍어보면 c1은 A가 나오고 c2는 1이 나온다
// 즉, 0~9의 int는 char로 캐스팅하면 그대로 char 타입의 '0'~'9'로 나오지만
// 그 이상부터는 ASCII 코드의 문자로 나온다

// String s = "123";
// int i = Integer.parseInt(s);
// String을 int로 변환하는 방법

// int i = 123;
// String s = Integer.toString(i);
// int를 String으로 변환하는 방법

// char c = '5';
// 1. if (c == 5)
// 2. if (c == 48)
// 1번은 Java가 알아서 '5'를 숫자 5로 인식하기 때문에 참이다
// 2번도 ASCII 코드에 의해서 참이다