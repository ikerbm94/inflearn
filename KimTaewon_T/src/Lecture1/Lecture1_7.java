package Lecture1;

import java.util.Scanner;

public class Lecture1_7 {

    // 대문자로 만들어주는 메서드
    public static char makeUpper(char c) {
        if (Character.isLowerCase(c)) {
            return Character.toUpperCase(c);
        } else {
            return c;
        }
    }

    // 앞뒤로 동시에 한칸씩 올라가고 내려오면서 하나씩 비교해서 결과 값 도출
    public static String solution(String str) {

        // 선언
        char[] cArr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (makeUpper(cArr[lt]) == makeUpper(cArr[rt])) {
                lt++;
                rt--;
            } else {
                return "회문 문자열이 아닙니다.";
            }
        }

        return "YES";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));

    }

}
