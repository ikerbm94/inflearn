package Lecture1;

import java.util.Scanner;

// 강의 내용
public class Lecture1_12 {

    public static String toString(int input_i, String input_str) {

        // 결과값
        String result = "";

        for (int i = 0 ; i < input_i ; i++) {
            // 범위가 0 ~ 7인 사이의 문자를 빼내어, #은 1로 *은 0으로 변형
            String str = input_str.substring(0, 7).replace('#', '1').replace('*', '0');
            // 2진수 형태의 String 값을 계산하여 10진수 int로 변형
            int num = Integer.parseInt(str, 2);
            // 문자로 변형 (ASCII 코드)
            result += (char)num;
            // input_i번의 for문을 돌리면서 그때마다 7개씩 앞의 문자는 제거한다
            input_str = input_str.substring(7);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input_i = sc.nextInt();
        String input_str = sc.next();

        String answer = toString(input_i, input_str);
        System.out.println(answer);

    }

}

// String str = "ABCDEFG";
// str.substring(3) -> "DEFG"
// str.substring(2,4) -> "CDE"
// 배열의 인덱스와는 달리 이때는 각 문자 사이사이에 인덱스가 존재한다
// 0 A 1 B 2 C 3 D 4 E 5 F 6 G 7
// str.substring(0,7) -> "ABCDEFG"

// Integer.parseInt(str) => 10진수 형태의 String 값을 10진수의 int로 변형
// Integer.parseInt(str, 10) => 10진수 형태의 String 값을 10진수의 int로 변형
// Integer.parseInt(str, 16) => 16진수 형태의 String 값을 16진수의 int로 변형
// Integer.parseInt(str, 8) => 8진수 형태의 String 값을 8진수의 int로 변형
// Integer.parseInt(str, 4) => 4진수 형태의 String 값을 4진수의 int로 변형
// Integer.parseInt(str, 2) => 2진수 형태의 String 값을 2진수의 int로 변형

// String str = "ABCDEF";
// str.replace('A', 'a') -> "aBCDEF"
// => 패턴의 일부분을 교체하여 반환하는 문법