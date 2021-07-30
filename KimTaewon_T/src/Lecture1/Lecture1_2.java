package Lecture1;

import java.util.Scanner;

public class Lecture1_2 {

    public static void main(String[] args) {

        // 선언
        char unit = ' ';
        String rs = "";

        // String 입력 받기
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        // 소문자는 대문자로 대문자는 소문자로 바꾸기
        for (int i = 0; i < input.length(); i++) {

            if (Character.isUpperCase(input.charAt(i))) {
                unit = Character.toLowerCase(input.charAt(i));
            } else if (Character.isLowerCase(input.charAt(i))) {
                unit = Character.toUpperCase(input.charAt(i));
            }

            rs += unit;

        }

        // 바꾼거 출력하기
        System.out.println(rs);

    }
}

//  for(int i = 0 ; i < 1 ; i++){
//      String str = "abcde";
//  }
//  System.out.println(str);
// => 반복문안에서는 변수 선언은 금지이다