package Lecture1;

import java.util.Scanner;

public class Lecture1_5 {

    // 강의 내용
    public static String solution(String str) {

        // 선언
        String rs = "";
        char[] cArr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        // char배열의 맨 앞과 맨 뒤에서 부터 각각 출발하여, 특수문자는 스킵하면서, 하나씩 올라가고 하나씩 내려가면서
        // cArr[lt]와 cArr[rt]를 바꿔준다
        // lt가 rt와 같거나 커지면 while문이 종료된다
        while(lt < rt){
            if (!Character.isAlphabetic(cArr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(cArr[rt])) {
                rt--;
            } else {
                char tmp = cArr[lt];
                cArr[lt] = cArr[rt];
                cArr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        rs = String.valueOf(cArr);

        return rs;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));

    }
}

// String str = "abcde";
// char[] cArr = str.toCharArray();
// => String을 char배열로 만드는 방법

// String.valueOf(char[] cArr);
// => char배열을 String으로 만드는 방법

// Character.isAlphabetic(char c);
// => char c가 알파벳이면 true를, 알파벳이아니면 false를 리턴